import java.sql.*;
import java.util.List;

public class MySqlAdsDao implements Ads{
    private Connection connection;

    public MySqlAdsDao(){
        Config config = new Config();
            try {
                DriverManager.registerDriver(new Driver());
                connection = DriverManager.getConnection(
                        Config.getUrl(),
                        Config.getUser(),
                        Config.getPassword()
                ); }
            catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

    @Override
    public List<Ad> all() {
       try{
           Statement statement = connect.createStatement();
           ResultSet results = statement.executeQuery("SELECT * FROM ads");
                   return createAds(results);
       } catch (SQLException e){
           throw new RuntimeException("Error selecting ads");
       }
    }

    @Override
    public Long insert(Ad ad) {
        try {
            PreparedStatement stmt = connect.prepareStatement(createInsertQuery(ad), Statement.RETURN_GENERATED_KEYS)
            stmt.setLong(1, 1);
            stmt.setShort(2, ad.getTitle());
            stmt.setString(1, ad.getDescription());

            ResultSet result = stmt.getGeneratedKeys();
            result.next();
            return result.getLong(1);
        } catch (SQLException e){
            throw new RuntimeException("Error adding new ad");
        }
    }

    private String createInsertQuery(Ad ad){
        return "Insert into ads(user_id, title, description)";
    }


}
