import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeService {
    // Холболтын мэдээллийг энд төвлөрүүлнэ
    private final String url = "jdbc:postgresql://localhost:5432/session_36";
    private final String user = "postgres";
    private final String password = "postgres";

    // Холболт үүсгэх туслах функц
    private Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    // Бусад методууд энд орно
    public void addEmployee(String firstName, String lastName, String department, int salary) {

        String sql = "INSERT INTO employees (first_name, last_name, department, salary) VALUES (?, ?, ?, ?)";

        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setString(3, department);
            pstmt.setInt(4, salary);

            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " ажилтан амжилттай нэмэгдлээ.");

        } catch (SQLException e) {
            System.out.println("Ажилтан нэмэхэд алдаа гарлаа: " + e.getMessage());
        }
    }

    // === UPDATE ===
    public void updateEmployeeSalary(int id, int newSalary) {

        String sql = "UPDATE employees SET salary = ? WHERE employee_id = ?";

        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, newSalary);
            pstmt.setInt(2, id);

            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " ажилтны цалин шинэчлэгдлээ.");

        } catch (SQLException e) {
            System.out.println("Цалин шинэчлэхэд алдаа гарлаа: " + e.getMessage());
        }
    }

    // === DELETE ===
    public void deleteEmployee(int id) {
        String sql = "DELETE FROM employees WHERE employee_id = ?";

        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);

            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " ажилтан устгагдлаа.");

        } catch (SQLException e) {
            System.out.println("Ажилтан устгахад алдаа гарлаа: " + e.getMessage());
        }
    }

    // === TRANSACTION ===
    public void transferSalary(int fromEmployeeId, int toEmployeeId, int amount) {

        String sqlWithdraw = "UPDATE employees SET salary = salary - ? WHERE employee_id = ?";
        String sqlDeposit = "UPDATE employees SET salary = salary + ? WHERE employee_id = ?";

        Connection conn = null;

        try {
            conn = connect();

            // --- 1. Transaction-г эхлүүлэх ---
            conn.setAutoCommit(false);

            // 2. Мөнгө хасах (fromEmployeeId-аас)
            try (PreparedStatement pstmtWithdraw = 
            conn.prepareStatement(sqlWithdraw)) {
                pstmtWithdraw.setInt(1, amount);
                pstmtWithdraw.setInt(2, fromEmployeeId);
                pstmtWithdraw.executeUpdate();
            }

            // 3. Мөнгө нэмэх (toEmployeeId-руу)
            try (PreparedStatement pstmtDeposit = 
            conn.prepareStatement(sqlDeposit)) {
                pstmtDeposit.setInt(1, amount);
                pstmtDeposit.setInt(2, toEmployeeId);
                pstmtDeposit.executeUpdate();
            }

            // --- 4. Бүх үйлдэл амжилттай бол батлах (COMMIT) ---
            conn.commit();
            System.out.println("Шилжүүлэг амжилттай хийгдлээ.");
        } catch (SQLException e) {
            System.out.println("Алдаа гарлаа! Гүйлгээг буцааж байна (ROLLBACK).");
            try {
                if (conn != null) {
                    // --- 5. Алдаа гарсан тул буцаах (ROLLBACK) ---
                    conn.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.setAutoCommit(true); // Холболтыг буцаагаад хэвийн горимд шилжүүлэх
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
