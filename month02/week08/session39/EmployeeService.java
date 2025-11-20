import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement; // Энэ import-г нэмэхээ мартуузай
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    // ... (Таны холболтын мэдээлэл болон бусад методууд энд байна) ...
    private final String url = "jdbc:postgresql://localhost:5432/session_36";
    private final String user = "postgres";
    private final String password = "postgres";

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    /**
     * Өгөгдлийн сангаас бүх ажилтныг уншиж, List<Employee> болгон буцаана.
     */
    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();

        String sql = "SELECT employee_id, first_name, salary FROM employees";

        try (Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // 2. ResultSet-ээр давтах
            while (rs.next()) {
                // 3. Мөр бүрээс мэдээлэл авах
                int id = rs.getInt("employee_id");
                String firstName = rs.getString("first_name");
                int salary = rs.getInt("salary");

                // 4. Шинэ employee POJO үүсгэх
                Employee emp = new Employee(id, firstName, salary);

                // 5. Жагсаалтад нэмэх
                list.add(emp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // 6. Дүүрсэн жагсаалтыг буцаах
        return list;
    }

    /**
     * ID-аар нь нэг ажилтан хайж, Employee объект буцаана.
     */
    public Employee getEmployeeById(int id) {
        Employee employee = null; // Анх олдсонгүй гэж үзнэ

        String sql = "SELECT employee_id, first_name, salary FROM employees WHERE employee_id = ?";

        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // 1. '?' тэмдгийг аюулгүйгээр бөглөх
            pstmt.setInt(1, id);

            // 2. Query-г ажиллуулах
            try (ResultSet rs = pstmt.executeQuery()) {

                // 3. Үр дүнг унших
                if (rs.next()) {
                    // Хэрэв мөр олдвол, Employee объект үүсгэх
                    int empId = rs.getInt("employee_id");
                    String firstName = rs.getString("first_name");
                    int salary = rs.getInt("salary");

                    employee = new Employee(empId, firstName, salary);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // 4. Олдсон эсвэл null объектыг буцаах
        return employee;
    }
}