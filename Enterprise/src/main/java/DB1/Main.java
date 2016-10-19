package DB1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        loadDriver();
        LOGGER.info("Connection to DB");
        String url = "jdbc:postgresql://localhost:5432/company";
        String user = "postgres";
        String password = "rfhfv,f";
        try (Connection connection = DriverManager.getConnection(url, user, password);

             Statement statement = connection.createStatement()) {

            LOGGER.info("Successfully connection to DB");

            String sql = "SELECT * FROM EMPLOYEE";

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                Employee employee = new Employee();
                employee.setId(resultSet.getInt("ID"));
                employee.setName(resultSet.getString("NAME"));
                employee.setAge(resultSet.getInt("AGE"));
                employee.setAddress(resultSet.getString("ADDRESS"));
                employee.setSalary(resultSet.getFloat("SALARY"));
                employee.setJoinDate(resultSet.getString("JOIN_DATE"));
                System.out.println(employee.toString());
            }

        } catch (SQLException e) {
            e.printStackTrace();
            LOGGER.error("Exeption occured while connectiong to DB " + url + e);
        }
    }

    private static void loadDriver() {
        try {
            LOGGER.info("Loading JDBC driver: org.postgresql.Driver");
            Class.forName("org.postgresql.Driver");
            LOGGER.info("Driver successfully loaded");
        } catch (ClassNotFoundException e) {
            LOGGER.error("Cannot driver: org.postgresql.Driver");
            throw new RuntimeException(e);
        }
    }
}
