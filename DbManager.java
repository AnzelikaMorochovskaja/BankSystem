package codeacademy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DbManager {

    public DbManager() {
    }

    public List<Employee> getAllEmployee() {
        try {

            Connection connection = createConnection();

            PreparedStatement statement = connection.prepareStatement("SELECT * FROM DARBUOTOAS");

            ResultSet result = statement.executeQuery();

            List<Employee> employeeList = new ArrayList<Employee>();

            while (result.next()) {
                String personalCode = result.getString("asmenskodas");
                String name = result.getString("vardas");
                String lastName = result.getString("pavarde");
                Date worksFrom = result.getDate("dirbanuo");
                Date birthday = result.getDate("gimimometai");
                String occupation = result.getString("pareigos");
                String department = result.getString("skyrius_pavadinimas");
                Integer projectId = result.getInt("projektas_id");


                Employee employee = new Employee(
                        personalCode,
                        name,
                        lastName,
                        worksFrom,
                        birthday,
                        occupation,
                        department,
                        projectId
                );

                employeeList.add(employee);
            }

            return employeeList;
        } catch (SQLException e) {
            System.out.println("Unable to connecto to db");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Unable to find driver");
            e.printStackTrace();
        }
        return new ArrayList<Employee>();
    }

    private Connection createConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection(
                "jdbc:h2:tcp://localhost/~/test",
                "sa",
                ""
        );
    }
}
