package Lesson_51.part_6;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static Lesson_51.part_6.Configs.*;

public class UserServiceMySQL implements UserDAO {

  private Connection getConnection() {
    Connection dbConnection = null;
    String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

    } catch (ClassNotFoundException e) {
      System.out.println("Драйвер не загрузился");
      e.printStackTrace();
    } catch (SQLException e) {
      System.out.println("Connection не создан");
      e.printStackTrace();
    }
    return dbConnection;
  }

  @Override
  public void addUser(Users user) {
    Connection dbConnection = null;
    PreparedStatement preparedStatement = null;

    try {
      dbConnection = getConnection();
      String sqlQuerty = "INSERT INTO users (name, age, email) VALUES(?,?,?)";
      preparedStatement = dbConnection.prepareStatement(sqlQuerty);

      preparedStatement.setString(1, user.getName());
      preparedStatement.setInt(2, user.getAge());
      preparedStatement.setString(3, user.getEmail());

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

  @Override
  public List<Users> getAllUsers() {
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

  @Override
  public Users getUserById(int id) {
    Connection dbConnection = null;
    PreparedStatement preparedStatement = null;
    Users user = new Users();

    try {
      String sqlQuery = "SELECT id, name, age, email FROM users WHERE id=?";
      dbConnection = getConnection();
      preparedStatement = dbConnection.prepareStatement(sqlQuery);
      preparedStatement.setInt(1, id);

      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        user.setName(resultSet.getString("name"));
        user.setAge(resultSet.getInt("age"));
        user.setEmail(resultSet.getString("email"));
      }
      user.setId(id);

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
    return user;
  }

  @Override
  public void removeUserById(int id) {

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
}
