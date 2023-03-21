package Lesson_21.part_5;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MyTime {

  public static void main1(String[] args) {
    Date date = new Date();
    date.getDate();
    System.out.println(date.getTime() - System.currentTimeMillis());
  }

  public static void main2(String[] args) {
    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
    System.out.println(date);
    System.out.println(simpleDateFormat.format(date));
    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("d MMMM y в H:mm", Locale.US);
    System.out.println(simpleDateFormat2.format(date));
  }

  public static void main3(String[] args) {
    Calendar calendar = Calendar.getInstance();
    System.out.println(calendar.getTime());
  }

  public static void main4(String[] args) {
    LocalDate localDate1 = LocalDate.now();
    LocalDate localDate2 = LocalDate.of(2023, 03, 22);
    LocalDate localDate3 = LocalDate.parse("2023-03-22");

    System.out.println(localDate1);
    System.out.println(localDate2);
    System.out.println(localDate3);
  }

  public static void main(String[] args) {
    LocalDate localDate = LocalDate.now();
    System.out.println(localDate.getChronology());
    for (int i = 0; i < 70; i++) {
      System.out.println(localDate.plusDays(i).getDayOfWeek());
      System.out.println(localDate.plusDays(i).getDayOfYear());
    }
  }
}
