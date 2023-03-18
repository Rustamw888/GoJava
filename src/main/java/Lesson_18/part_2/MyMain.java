package Lesson_18.part_2;

public class MyMain {

  public static void main(String[] args) {

    Nabludatel nabludatel = new Nabludatel();
    System.out.println(nabludatel.getTemp());
    System.out.println(nabludatel.getPressure());
    nabludatel.update(100, 200);
    System.out.println(nabludatel.getTemp());
    System.out.println(nabludatel.getPressure());
    System.out.println("/////////////////////////////");

    Izdatel izdatel = new Izdatel(1, 2);
    System.out.println(izdatel.getTemp());
    System.out.println(izdatel.getPressure());
    izdatel.addNabludatel(nabludatel);
    System.out.println(nabludatel.getTemp());
    System.out.println(nabludatel.getPressure());
    izdatel.updateInfo();
    System.out.println(nabludatel.getTemp());
    System.out.println(nabludatel.getPressure());
  }

}
