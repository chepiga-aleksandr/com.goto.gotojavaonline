package DB1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        loadDriver();

        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/company")){

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   private static void loadDriver () {
       try{
           LOGGER.info ("Loading JDBC driver: org.postgresql.Driver");
           Class.forName("org.postgresql.Driver");
           LOGGER.info ("Driver successfully loaded");
       } catch (ClassNotFoundException e) {
           LOGGER.error("Cannot driver: org.postgresql.Driver");
           throw new RuntimeException(e);
       }
   }
}
