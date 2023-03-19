package Lesson_19.part_6_7_8;

public class MyGeneric {

  public static void main1(String[] args) {
    Message<String> stringMessage = new Message<>("Java");
    Message<Integer> integerMessage = new Message<>(10);
    Message message = new Message<>();
    System.out.println(stringMessage.getValue());
    System.out.println(integerMessage.getValue());
    System.out.println(message.getValue());
    System.out.println("/////////////////////////////////////////");
    stringMessage.setValue("new Java");
    integerMessage.setValue(12);
    message.setValue("string value");
    System.out.println(stringMessage.getValue());
    System.out.println(integerMessage.getValue());
    System.out.println(message.getValue());
  }

  public static void main(String[] args) {
    Message<String> m1 = new Message<>();
    System.out.println(m1.print("Java"));
  }

}
