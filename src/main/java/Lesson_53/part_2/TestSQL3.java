package Lesson_53.part_2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TestSQL3 {

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

  public static void removeUserById(int id) {

    String sqlQuery = "DELETE FROM users WHERE id=?";
    PreparedStatement preparedStatement = null;
    Connection dbConnection = null;

    try {
      dbConnection = getConnection();
      preparedStatement = dbConnection.prepareStatement(sqlQuery);
      preparedStatement.setInt(1, id);
      preparedStatement.executeUpdate();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      if (preparedStatement != null) {
        try {
          preparedStatement.close();
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
  }

  public static void main(String[] args) {
    Connection connection = null;
    Statement statement = null;
    try {
      connection = getConnection();
      System.out.println("Подключение к БД успешно");
      connection.setAutoCommit(false);
      statement = connection.createStatement();

      String SQL1 = "INSERT INTO users (name, age, email) VALUES('AAA', 1, 'bbb')";
      statement.executeUpdate(SQL1);

      SQL1 = "INSERT INTO users (name, age, email) VALUES('BBB', 11, 'aa')";
      statement.executeUpdate(SQL1);

//      removeUserById(8);
//      removeUserById(9);
      connection.commit();

    } catch (SQLException e) {
      try {
        connection.rollback();
      } catch (SQLException ex) {
        throw new RuntimeException(ex);
      }
    } finally {
      if (statement != null) {
        try {
          statement.close();
        } catch (SQLException e) {
          throw new RuntimeException(e);
        }
      }
      if (connection != null) {
        try {
          connection.close();
        } catch (SQLException e) {
          throw new RuntimeException(e);
        }
      }
    }
  }
}
