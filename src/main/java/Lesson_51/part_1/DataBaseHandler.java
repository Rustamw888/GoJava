package Lesson_51.part_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static Lesson_51.part_1.Configs.dbName;

public class DataBaseHandler {

  public static void main(String[] args) {

  }

  public static void createUser(Connection connection,
                                String name,
                                String age,
                                String email) throws SQLException {
    String insert = String.format(
        "INSERT " + dbName + ".%s (%s, %s, %s) VALUES(?,?,?)",
        Const.USER_TABLE,
        Const.USER_NAME,
        Const.USER_AGE,
        Const.USER_EMAIL
    );

    PreparedStatement preparedStatement = connection.prepareStatement(insert);
    preparedStatement.setString(1, name);
    preparedStatement.setString(2, age);
    preparedStatement.setString(3, email);

    preparedStatement.executeUpdate();
  }

  public static void deleteUser(Connection connection,
                                String name) throws SQLException {
    String delete = String.format("DELETE FROM %s WHERE NAME='%s'", Const.USER_TABLE, name);
    PreparedStatement preparedStatement = connection.prepareStatement(delete);
    preparedStatement.executeUpdate();
  }
}
