package Lesson_51.part_4;

import Lesson_51.part_1.Const;
import Lesson_51.part_4.dao.UserDAO;
import Lesson_51.part_4.pojo.Users;

import java.sql.*;
import java.util.List;

import static Lesson_51.part_4.Configs.*;

public class UserServiceMySQL implements UserDAO {
  @Override
  public void add(Users user) {
    String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
    Connection dbConnection = null;
    PreparedStatement preparedStatement = null;

    try {
      Class.forName("com.mysql.jdbc.Driver");
      dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

      String sqlQuerty = "INSERT INTO users (name, age, email) VALUES(?,?,?)";

      preparedStatement = dbConnection.prepareStatement(sqlQuerty);

      preparedStatement.setString(1, user.getName());
      preparedStatement.setInt(2, user.getAge());
      preparedStatement.setString(3, user.getEmail());

      preparedStatement.executeUpdate();

    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
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
  public List<Users> getAll() {
    return null;
  }

  @Override
  public Users getUserById(int id) {
    String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
    Connection dbConnection = null;
    PreparedStatement preparedStatement = null;
    Users user = new Users();

    try {
      Class.forName("com.mysql.jdbc.Driver");
      dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

      String sqlQuerty = "SELECT id, name, age, email FROM users WHERE id=?";

      preparedStatement = dbConnection.prepareStatement(sqlQuerty);

      preparedStatement.setInt(1, id);

      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        user.setName(resultSet.getString("name"));
        user.setAge(resultSet.getInt("age"));
        user.setEmail(resultSet.getString("email"));
      }
      user.setId(id);

    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
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
  public void remove(Users user) {

  }
}
