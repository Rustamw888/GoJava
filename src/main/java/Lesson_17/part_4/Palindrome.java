package Lesson_17.part_4;

public class Palindrome {

  public static void main(String[] args) {

    System.out.println(isPalindrome("ABBA BBBB ABba"));
    System.out.println(isPalindrome("ABBA 2345 AB' :ba"));
    System.out.println(isPalindrome("ABcvvbABA 2345 ABba"));
    System.out.println(isPalindrome("Madam, I'm Adam!"));
  }

  public static boolean isPalindrome(String text) {
    String s1 = text.toUpperCase().replaceAll("[^A-z]", "");
    StringBuffer s2 = new StringBuffer(s1).reverse();
    boolean answer = true;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(i)) {
        answer = false;
        break;
      }
    }
    return answer;
  }

}
