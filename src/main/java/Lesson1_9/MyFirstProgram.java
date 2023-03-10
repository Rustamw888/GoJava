package Lesson1_9;

import java.io.IOException;
import java.util.Random;

public class MyFirstProgram {

//  public static void main(String[] args) {

//    Scanner enter = new Scanner(System.in);
//    int value;
//    do {
//      System.out.println("Введите число больше 3, но меньше 15");
//      value = enter.nextInt();
//    } while (value < 3 || value > 15);
//
//    for (int i = 0; i < value; i++) {
//      for (int j = 0; j < value; j++) {
//        if (j < value-(1 + i)) {
//          System.out.print(" ");
//        } else {
//          System.out.print("*");
//        }
//      }
//      System.out.println();
//    }
//

//    int [][] array = {{1, 2, 4}, {2, 7}, {5, 7, 9, 10}};
//
//    for (int i = 0; i < array.length; i++) {
//      for (int j = 0; j < array[i].length; j++) {
//        System.out.print(array[i][j] + " ");
//      }
//      System.out.println();
//    }
//
//  }

//  public static void main(String[] args) {
//
//    ArrayList arrayList = new ArrayList<>();
//
//    arrayList.add(1);
//    arrayList.add(2);
//    arrayList.add(3);
//
//    for (Object o : arrayList) {
//      System.out.println(o);
//    }
//  }
//
//  public static void main(String[] args) {
//    try {
//      int a = 4;
//      int b = 0;
//      int result = a / b;
//      System.out.println(result);
//    } catch (Exception e) {
//      System.err.println("деление на ноль");
//    } finally {
//      System.out.println("Финал");
//    }
//  }

//  public static void main(String[] args) {
//    Object a = 12;
//    System.out.println("a = " + a);
//    a = "Java script is very simple";
//    System.out.println("a = " + a);
//    a = 213.43433434;
//    System.out.println("a = " + a);
//
//    var ad = "fgdfg";
//    System.out.println(ad.contains("f"));
//  }

//  public static void main(String[] args) throws FileNotFoundException, IOException {
////    File file = new File("./src/main/java/Lesson1_5");
////
////    String [] fileName = file.list();
////    for (int i = 0; i < fileName.length; i++) {
////      System.out.println(fileName[i]);
////    }
//
//    File fileTxt = new File("./src/main/java/Lesson1_5/test.txt");
//    System.out.println(fileTxt.length());
//    InputStream stream = new FileInputStream(fileTxt);
//    int len = stream.available();
//    System.out.println(len);
//
//    byte[] data = new byte[len];
//    stream.read(data);
//
//    String str = new String(data);
//    System.out.println(str);
//
////    for (byte datum : data) {
////      System.out.println(datum);
////    }
//
//    FileOutputStream fileOutputStream = new FileOutputStream(fileTxt, true);
//    // без true, добавляться не будет, в просто перезапишет файл на новое значение.
//    String newStr = " ))))))))))))";
//    byte[] newByte = newStr.getBytes();
//    fileOutputStream.write(newByte);
//    fileOutputStream.close();
//
//  }
//
//  public static void main(String[] args) throws FileNotFoundException {
//    File file = new File("src/main/java/Lesson1_5/test.txt");
//    Scanner scanner = new Scanner(file);
//    while (scanner.hasNextLine()) {
//      System.out.println(scanner.nextLine());
//    }
//    scanner.close();
//  }

//  public static void main(String[] args) {
//
//    ArrayList<String> arrayList = new ArrayList<>();
//
//    arrayList.add("tiger");
//    arrayList.add("cat");
//    arrayList.add("dog");
//    arrayList.add("pig");
//
//    System.out.println(arrayList);
//
//    Collections.sort(arrayList);
//
//    System.out.println(arrayList);
//
//  }

//  public static void main(String[] args) throws FileNotFoundException {
//
//  // создать файл и записать в него данные
//    File inputFile = new File("src/main/java/Lesson1_5/input.txt");
//    Formatter formatter = new Formatter(inputFile);
//    for (int i = 0; i < 10; i++) {
//      int a = new Random().nextInt(1000);
//      formatter.format("%s %s", a, "\r");
//    }
//    formatter.close();
//
//  // прочитать содержимое файла
//  Scanner scanner = new Scanner(inputFile);
//  ArrayList list = new ArrayList<>();
//  while (scanner.hasNext()) {
//    list.add(scanner.next());
//  }
//    System.out.println(list);
//
//  // отсортировать содержимое файла
//  Collections.sort(list);
//    System.out.println(list);
//
//  // записать в новый файл
//  File outputFile = new File("src/main/java/Lesson1_5/output.txt");
//  Formatter formatter1 = new Formatter(outputFile);
//    for (int i = 0; i < list.size(); i++) {
//      formatter1.format("%s %s", list.get(i), "\r");
//    }
//    formatter1.close();
//  }
//
//  int age;
//  String name;
//  static String sex;
//
//  public static void main(String[] args) {
//    MyFirstProgram myFirstProgram = new MyFirstProgram();
//    System.out.println(myFirstProgram.age);
//    System.out.println(myFirstProgram.name);
//    System.out.println(sex);
//  }
//
//  void test() {
//    System.out.println(age);
//    System.out.println(name);
//    System.out.println(sex);
//  }

  public static void main(String[] args) throws IOException {
    char expected = (char) (new Random().nextInt(26) + 65);
    char actual;
    System.out.println("Угадай символ: ");
    while (true) {
      actual = (char) System.in.read();
      System.in.read();
      if (actual == expected) {
        System.out.println("Поздравляю, Вы угадали)))");
        break;
      } else if (actual > expected) {
        System.out.println("Ожидаемый символ меньше");
      } else {
        System.out.println("Ожидаемый символ больше");
      }
    }


  }

}
