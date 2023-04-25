package Lesson_58;

import java.rmi.Naming;

public class Client {

  public static void main(String[] args) {
//    if (System.getSecurityManager() == null) {
//      System.setSecurityManager(new RMIClassLoaderSpi());
//    }

//    String security = "\nUsage: java -Djava.security.policy=security.policy";

    try {
      String serverURL = "rmi://localhost:1099/HELLO2021";
      HelloInterface helloClient = (HelloInterface) Naming.lookup(serverURL);
      System.out.println(helloClient.revers("Hello Java"));
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
