 import com.mysql.cj.jdbc.Driver;


        import javax.xml.transform.Result;
        import java.sql.*;

public class jdbcLecture {

    public static void main(String[] args) throws SQLException {

        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true", "super","codeup");


        Statement statement = connection.createStatement();

        //Example: Utilizing a SELECT
        String selectQuery = "SELECT * FROM albums";

        ResultSet selectResults = statement.executeQuery(selectQuery); //remember: casing extra important for entire time / code saved for long amounts of time

        while (selectResults.next()) { //WHILE there are rows that are NEXT. .

            System.out.println("Here's a album:");
            System.out.println("artist : " + selectResults.getString("artist"));
        }

        //Example: INSERTION of new record + return of ID that was generated

        String insertQuery = "INSERT INTO albums (artist, name, release_date, genre, sales) VALUES ('Drake','Take Care', 2011, 'R&B', 1000 )";

        Statement insertStatement = connection.createStatement();

        insertStatement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
        ResultSet insertResults = insertStatement.getGeneratedKeys();

        if (insertResults.next()) {
            System.out.println("Administrator - A new item has been created with the id of : " + insertResults.getLong(1));
        }

    }

}