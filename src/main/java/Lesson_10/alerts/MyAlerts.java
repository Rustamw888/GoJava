package Lesson_10.alerts;

import javax.swing.JOptionPane;

public class MyAlerts {

  public static void main(String[] args) {
//    JOptionPane.showMessageDialog(null, "Димка, нетакусик!!!"); /1
//    JOptionPane.showMessageDialog(null, "Димка, нетакусик!!!", "Окно", JOptionPane.PLAIN_MESSAGE); /2
//    String str = JOptionPane.showInputDialog("Введите пароль: "); /3
//    JOptionPane.showMessageDialog(null, str, "Ваш пароль", JOptionPane.PLAIN_MESSAGE); /3

    String s1 = JOptionPane.showInputDialog("Введите первое число: ");
    String s2 = JOptionPane.showInputDialog("Введите второе число: ");

    Integer sum = Integer.parseInt(s1) + Integer.parseInt(s2);

    JOptionPane.showMessageDialog(null, "sum = " + sum);
  }

}
