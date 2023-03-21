package Lesson_21.part_5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MyTime {

  public static void main1(String[] args) {
    Date date = new Date();
    date.getDate();
    System.out.println(date.getTime() - System.currentTimeMillis());
  }

  public static void main(String[] args) {
    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
    System.out.println(date);
    System.out.println(simpleDateFormat.format(date));
    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("d MMMM y в H:mm", Locale.US);
    System.out.println(simpleDateFormat2.format(date));
  }

}
