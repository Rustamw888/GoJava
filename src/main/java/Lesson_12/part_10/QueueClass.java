package Lesson_12.part_10;

public class QueueClass {

  public static void main(String[] args) {
    QueueClass queueClass = new QueueClass(5);
    int a;

    for (int i = 10; i < 15; i++) {
      queueClass.put(i * 10);
    }

    for (int i = 10; i < 15; i++) {
      a = queueClass.get();
    }
  }

  int[] a;
  int setLoc;
  int getLoc;

  QueueClass(int size) {
    a = new int[size + 1];
    setLoc = getLoc = 0;
  }

  void put(int x) {
    if(setLoc == a.length - 1) {
      System.out.println("Queue is FULL!!!");
      return;
    }
    a[setLoc] = x;
    setLoc++;
  }

  int get() {
    if (getLoc == setLoc) {
      System.out.println("Queue is EMPTY!!!");
      return 0;
    }
    getLoc++;
    System.out.println("a = " + a[getLoc]);
    return a[getLoc];
  }

}
