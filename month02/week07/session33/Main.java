import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // 1. Холболтын мэдээлэл.
        String url = "jdbc:postgresql://localhost:5432/session_33";
        String user = "postgres";
        String password = "postgres";
        Connection connection = null;
        try {
            // 2. Холболт уусгэх
            connection = DriverManager.getConnection(url, user, password);

            // 3. Амжилттай бол
            System.out.println("PostgreSQL-тэй амжилттай холбогдлоо!");

        } catch (SQLException e) {
            // 4. Алдаа гарвал
            System.out.println("Холболт амжилтгүй!");
            System.out.println("Алдаа: " + e.getMessage());

        } finally {
            // 5. Холболтыг хаах
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                    System.out.println("Холболт хаагдлаа.");
                }
            } catch (SQLException e) {
                System.out.println("Хаах үед алдаа: " + e.getMessage());
            }
        }
    }
}