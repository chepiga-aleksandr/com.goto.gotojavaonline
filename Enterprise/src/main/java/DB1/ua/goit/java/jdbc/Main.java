package DB1.ua.goit.java.jdbc;

import DB1.ua.goit.java.jdbc.model.jdbc.JdbcEmployeeDao;
import DB1.ua.goit.java.jdbc.model.EmployeeDao;

public class Main {

    public static void main(String[] args) {

        EmployeeDao jdbcemployeeDao = new JdbcEmployeeDao();

        System.out.println("All employees");

        jdbcemployeeDao.getAll().forEach(System.out::println);

        System.out.println("Employee with id 3");
        System.out.println(jdbcemployeeDao.load(3));
    }
}
