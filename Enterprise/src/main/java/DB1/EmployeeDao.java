package DB1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDao.class);

    private String url = "jdbc:postgresql://localhost:5432/company";
    private String user = "user";
    private String password = "123456";

    public EmployeeDao() {

        loadDriver();
    }

    public List<Employee> getAll() {

        List<Employee> result = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(url, user, password);

             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery("SELECT * FROM EMPLOYEE");

            while (resultSet.next()) {

                Employee employee = new Employee();
                employee.setId(resultSet.getInt("ID"));
                employee.setName(resultSet.getString("NAME"));
                employee.setAge(resultSet.getInt("AGE"));
                employee.setAddress(resultSet.getString("ADDRESS"));
                employee.setSalary(resultSet.getFloat("SALARY"));
                employee.setJoinDate(resultSet.getString("JOIN_DATE"));
                result.add(employee);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            LOGGER.error("Exeption occured while connectiong to DB " + url + e);
            throw new RuntimeException(e);
        }
        return result;
 }

    private void loadDriver() {
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
