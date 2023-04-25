package Lesson_58;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloInterface extends Remote {

  String revers(String text) throws RemoteException;
}
