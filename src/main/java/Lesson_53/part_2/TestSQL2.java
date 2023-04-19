package Lesson_53.part_2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TestSQL2 {

  private static Connection getConnection() throws SQLException {
    ResourceBundle resourceBundle = ResourceBundle.getBundle("database");
    String dbUrl = resourceBundle.getString("dbUrl");
    String dbUser = resourceBundle.getString("dbUser");
    String dbPass = resourceBundle.getString("dbPass");
    return DriverManager.getConnection(dbUrl, dbUser, dbPass);
  }

  public static List<Users> getAllUsers() {
    Connection dbConnection = null;
    Statement statement = null;
    List<Users> users = new ArrayList<>();

    try {
      String sqlQuery = "SELECT id, name, age, email FROM users";
      dbConnection = getConnection();
      statement = dbConnection.createStatement();
      ResultSet resultSet = statement.executeQuery(sqlQuery);
      while (resultSet.next()) {
        Users user = new Users();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("name"));
        user.setAge(resultSet.getInt("age"));
        user.setEmail(resultSet.getString("email"));
        users.add(user);
      }

    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      if (statement != null) {
        try {
          statement.close();
        } catch (SQLException e) {
          throw new RuntimeException(e);
        }
      }
      if (dbConnection != null) {
        try {
          dbConnection.close();
        } catch (SQLException e) {
          throw new RuntimeException(e);
        }
      }
    }
    return users;
  }

  public static void main(String[] args) {
    try(Connection connection = getConnection()) {
      System.out.println("Подключение к БД успешно");
      List<Users> usersList = getAllUsers();
      for (Users users : usersList) {
        System.out.println("users = " + users);
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
