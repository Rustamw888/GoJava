package Lesson_59.part_1;

import java.util.Optional;

public class MainOpt {

  public static void main(String[] args) {
//    final User user = new User("Tony", "mail");
    final User user = new User("Tony", null);

    System.out.println(user.getName());
//    System.out.println(user.getEmail().get());
//    System.out.println(user.getEmail().orElse("!"));
    System.out.println(user.getEmail().orElseGet(() ->  {
      String s = "Yoyo";
      return s + "!!!!!!";
    }));
  }
}

class User {
  private String name;
  private String email;

  public User() {
  }

  public User(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

//  public String getEmail() {
//    return email;
//  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Optional<String> getEmail() {
    return Optional.ofNullable(email);
  }
}