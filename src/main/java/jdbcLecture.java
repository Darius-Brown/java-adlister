 import com.mysql.cj.jdbc.Driver;


        import javax.xml.transform.Result;
        import java.sql.*;

public class jdbcLecture {

    public static void main(String[] args) throws SQLException {

        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/example_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true", "root", "codeup");


        Statement statement = connection.createStatement();

        //Example: Utilizing a SELECT
        String selectQuery = "SELECT * FROM products";

        ResultSet selectResults = statement.executeQuery(selectQuery); //remember: casing extra important for entire time / code saved for long amounts of time

        while (selectResults.next()) { //WHILE there are rows that are NEXT. .

            System.out.println("Here's a product:");
            System.out.println("name : " + selectResults.getString("name")); //Talk to a column named 'name' that has a string
            System.out.println("price: $" + selectResults.getInt("price") + "\n"); //Talk to a column named 'price' that has an int
        }

        //Example: INSERTION of new record + return of ID that was generated

        String insertQuery = "INSERT INTO products (name, price) VALUES ('nailgun', 250)";

        Statement insertStatement = connection.createStatement();

        insertStatement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
        ResultSet insertResults = insertStatement.getGeneratedKeys();

        if (insertResults.next()) {
            System.out.println("Administrator - A new item has been created with the id of : " + insertResults.getLong(1));
        }

    }

}