package Lesson_58;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {

  public static void main(String[] args) {
//    if (System.getSecurityManager() == null) {
//      System.setSecurityManager(new SecurityManager());
//    }

    try {
      HelloObject hello = new HelloObject();
//      HelloObject2 hello2 = new HelloObject2();
//
//      HelloInterface stub = (HelloInterface) UnicastRemoteObject.exportObject(hello2, 0);
//      Registry registry = LocateRegistry.createRegistry(1099);
//      registry.bind("HELLO2021", stub);

    LocateRegistry.createRegistry(1099);
    Naming.rebind("rmi://localhost:1099/HELLO2021", hello);
      System.out.println("Server started...");
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
