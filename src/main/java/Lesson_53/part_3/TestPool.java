package Lesson_53.part_3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class TestPool {

  public static void main(String[] args) {
    ResourceBundle resource = ResourceBundle.getBundle("database");
    String dbUrl = resource.getString("dbUrl");
    String dbUser = resource.getString("dbUser");
    String dbPass = resource.getString("dbPass");

    Connection conn = null;
    ConnectionPool pool = new ConnectionPool(dbUrl, dbUser, dbPass, 2);

    try {
      conn = pool.getConnection();
      try (Statement statement = conn.createStatement()) {
        ResultSet res = statement.executeQuery("select * from users");
        System.out.println("There are below tables:");
        while (res.next()) {
          System.out.println(res.getString(1));
          System.out.println("| ");
          System.out.println(res.getString(2));
          System.out.println("| ");
          System.out.println(res.getString(3));
          System.out.println("| ");
          System.out.println(res.getString(4));
          System.out.println();
        }
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      if (conn != null) {
        try {
          pool.returnConnection(conn);
        } catch (SQLException e) {
          throw new RuntimeException(e);
        }
      }
    }
  }
}
