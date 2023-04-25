package Lesson_58;

import java.rmi.Remote;

public interface HelloInterface extends Remote {

  String revers(String text) throws RuntimeException;
}
