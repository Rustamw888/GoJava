package Lesson_51.part_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static Lesson_51.part_1.Configs.*;

public class Main {

  public static void main(String[] args) {
    String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;

    Connection dbConnection = null;

    String name = "Archi";
    String age = "21";
    String email = "archi@mail.com";

    try {
      Class.forName("com.mysql.jdbc.Driver");
      dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
      String insert = String.format(
//          "INSERT " + dbName + ".%s (%s, %s, %s) VALUES(?,?,?)",
          "INSERT %s (%s, %s, %s) VALUES(?,?,?)",
          Const.USER_TABLE,
          Const.USER_NAME,
          Const.USER_AGE,
          Const.USER_EMAIL
      );

      PreparedStatement preparedStatement = dbConnection.prepareStatement(insert);
      preparedStatement.setString(1, name);
      preparedStatement.setString(2, age);
      preparedStatement.setString(3, email);

      preparedStatement.executeUpdate();

    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        dbConnection.close();
      } catch (SQLException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
