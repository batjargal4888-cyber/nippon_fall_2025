import java.sql.Connection;
import java.sql.DriverManager;
// import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookList;

    public Library() {
        bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void printAllBooks() {
        for (Book b : bookList) {
            b.printInfo();
        }
    }

    // =============================
    // Даалгавар 3: JDBC Query
    // =============================
    public void printAverageRating() {

        // connection info
        String url = "jdbc:postgresql://localhost:5432/session_35";
        String userName = "postgres";
        String password = "postgres";

        // create connection related objects
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;

        // Query
        String sqlQuery = "SELECT AVG(rating) AS avg_rating FROM book_reviews;";

        try {
            // From java connect to Postgresql
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("System connected successfully! Executing query....");
            // statement creation
            statement = conn.createStatement();
            rs = statement.executeQuery(sqlQuery);

            // Read result
            while (rs.next()) {
                double avg = rs.getDouble("avg_rating");
                System.out.println("Бүх номны дундаж үнэлгээ: " + avg);
            }

        } catch (SQLException e) {
            System.out.println("Error occured: " + e.getMessage());
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (statement != null)
                    statement.close();
                if (conn != null)
                    conn.close();
                System.out.println("Connection closed!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void removeBookByTitle(String title) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).title.equals(title)) {
                bookList.remove(i);
                System.out.println("Устгалаа: ");
                break;
            }
        }
    }
}