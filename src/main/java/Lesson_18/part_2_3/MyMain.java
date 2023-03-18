package Lesson_18.part_2_3;

public class MyMain {

  public static void main(String[] args) {

    Nabludatel1 nabludatel1 = new Nabludatel1();
    Nabludatel2 nabludatel2 = new Nabludatel2();
    System.out.println(nabludatel1.getTemp());
    System.out.println(nabludatel1.getPressure());
    nabludatel1.update(100, 200);
    System.out.println(nabludatel1.getTemp());
    System.out.println(nabludatel1.getPressure());
    System.out.println("/////////////////////////////");

    Izdatel izdatel = new Izdatel(1, 2);
    System.out.println(izdatel.getTemp());
    System.out.println(izdatel.getPressure());
    izdatel.addNabludatel(nabludatel1);
    System.out.println(nabludatel1.getTemp());
    System.out.println(nabludatel1.getPressure());

  }

}
