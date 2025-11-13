import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ActorFilter {
    public static void main(String[] args) {
        // connection info
        String url = "jdbc:postgresql://localhost:5432/dvd_rental";
        String userName = "postgres";
        String password = "postgres";

        // create connection related objects
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;

        // Query
        String sqlQuery = "SELECT actor_id, first_name, last_name FROM actor LIMIT 10;";

        try {
            // From java connect to Postgresql
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("System connected successfully! Executing query....");
            // statement creation
            statement = conn.createStatement();
            rs = statement.executeQuery(sqlQuery);

            // First 10 actors
            System.out.println("========== First Ten Actors ==========");
            while(rs.next()) {
                int id = rs.getInt("actor_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                System.out.println("ID: " + id + ", Name: " + firstName + " " + lastName);
            }

        } catch (SQLException e) {
            System.out.println("Error occured: " + e.getMessage());
        } finally {
            try {
                if (rs!=null) rs.close();
                if (statement != null) statement.close();
                if (conn != null) conn.close();
                System.out.println("Connection closed!");
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }
}
