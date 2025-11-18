import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class InsertEmpolyee {
    public static void main(String[] args) {

        // --- Database connection info ---
        String url = "jdbc:postgresql://localhost:5432/session_36";
        String user = "postgres";
        String password = "postgres";

        Scanner scanner = new Scanner(System.in);

        try {
            // 1. Хэрэглэгчээс өгөгдөл авах
            System.out.print("Ажилтны нэр (first_name): ");
            String firstName = scanner.nextLine();

            System.out.print("Ажилтны овог (last_name): ");
            String lastName = scanner.nextLine();

            System.out.print("Ажилтны хэлтэс (department): ");
            String department = scanner.nextLine();

            System.out.print("Ажилтны цалин: ");
            int salary = scanner.nextInt();
            scanner.nextLine(); // newline trap

            // 2. SQL бэлтгэх
            String sql = "INSERT INTO employees (first_name, last_name, department, salary) VALUES (?, ?, ?, ?)";

            // 3. Холболт нээж, PreparedStatement үүсгэх
            try (Connection conn = DriverManager.getConnection(url, user, password);
                    PreparedStatement pstmt = conn.prepareStatement(sql)) {

                // 4. ?-үүдэд утга оноох
                pstmt.setString(1, firstName);
                pstmt.setString(2, lastName);
                pstmt.setString(3, department);
                pstmt.setInt(4, salary);

                // 5. Ажиллуулах
                int rows = pstmt.executeUpdate();

                // 6. Үр дүн
                if (rows > 0) {
                    System.out.println("Ажилтан амжилттай нэмэгдлээ!");
                }

            } catch (SQLException e) {
                System.out.println("INSERT хийхэд алдаа гарлаа: " + e.getMessage());
            }

        } finally {
            scanner.close();
            System.out.println("Програм дууслаа.");
        }
    }
}
