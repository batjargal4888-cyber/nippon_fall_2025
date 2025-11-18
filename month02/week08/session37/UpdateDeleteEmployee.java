import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

class UpdateDeleteEmployee {
    public static void main(String[] args) {

        // --- Холболтын мэдээллээ өөрийнхөөрөө солино уу ---
        String url = "jdbc:postgresql://localhost:5432/session_36"; // 'company' хэсгийг өөрийн ДБ-н нэрээр
        String user = "postgres";
        String password = "postgres"; // Нууц үгээ энд бичнэ үү
        // ----------------------------------------------

        Scanner scanner = new Scanner(System.in);

        // --- 1-Р ХЭСЭГ: UPDATE ---
        try {
            System.out.println("--- Ажилтны Цалин Шинэчлэх ---");
            System.out.println("Аль ажилтны ID-г шинэчлэх вэ?: ");
            int idToUpdate = scanner.nextInt();

            System.out.println(idToUpdate + " ID-тай ажилтны ШИНЭ цалинг оруулна уу: ");
            int newSalary = scanner.nextInt();
            scanner.nextLine(); // "Newline trap" цэвэрлэх

            String sqlUpdate = "UPDATE employees SET salary = ? WHERE employee_id = ?;";

            // try-with-resources ашиглан холболт үүсгэх
            // 'conn' ба 'pstmt' нь try блок дуусмагц автоматаар хаагдана
            try (Connection conn = DriverManager.getConnection(url, user, password);
                    PreparedStatement pstmt = conn.prepareStatement(sqlUpdate)) {

                pstmt.setInt(1, newSalary); // Эхний ?
                pstmt.setInt(2, idToUpdate); // Хоёр дахь

                int rowsAffected = pstmt.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println(idToUpdate + " ID-тай ажилтны цалин амжилттай шинэчлэгдлээ.");
                } else {
                    System.out.println(idToUpdate + " ID-тай ажилтан олдсонгүй.");
                }
            }
        } catch (SQLException e) {
            System.out.println("UPDATE хийхэд алдаа гарлаа: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Алдаа: ID болон цалинг зөвхөн тоогоор оруулна уу.");
            scanner.nextLine(); // Буруу орцыг цэвэрлэх
        }

        // --- 2-р ХЭСЭГ: DELETE ---
        try {
            System.out.println("\n--- Ажилтан Устгах ---");
            System.out.println("Устгах ажилтны ID-г оруулна уу: ");
            int idToDelete = scanner.nextInt();
            scanner.nextLine(); // "Newline trap" цэвэрлэх

            String sqlDelete = "DELETE FROM employees WHERE employee_id = ?;";

            try (Connection conn = DriverManager.getConnection(url, user, password);
                    PreparedStatement pstmt = conn.prepareStatement(sqlDelete)) {

                pstmt.setInt(1, idToDelete); // Эхний ?

                int rowsAffected = pstmt.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println(idToDelete + " ID-тай ажилтан амжилттай устгагдлаа.");
                } else {
                    System.out.println(idToDelete + " ID-тай ажилтан олдсонгүй.");
                }
            }

        } catch (SQLException e) {
            System.out.println("DELETE хийхэд алдаа гарлаа: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Алдаа: ID-г зөвхөн тоогоор оруулна уу.");
        } finally {
            scanner.close();
            System.out.println("\nПрограм дууслаа.");
        }
    }
}
