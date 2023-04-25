package Lesson_58;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloObject2 extends UnicastRemoteObject implements HelloInterface {

  protected HelloObject2() throws RemoteException {
    super();
  }

  @Override
  public String revers(String text) throws RuntimeException {
    return new StringBuilder(text).reverse() + "obj2";
  }
}
