package Lesson_12;

public class Caesar {

  private String alphaB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private String alphaS = "abcdefghijklmnopqrstuvwxyz";

  public String encrypt(String input, int key) {
    String shiftAlphaB = alphaB.substring(key) + alphaB.substring(0, key);
    String shiftAlphaS = alphaS.substring(key) + alphaS.substring(0, key);
    String s = "";
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      int pos;
        if(Character.isLetter(ch) && Character.isUpperCase(ch)) {
          pos = alphaB.indexOf(ch);
          s = s + shiftAlphaB.charAt(pos);
        } else if(Character.isLetter(ch) && Character.isLowerCase(ch)) {
          pos = alphaS.indexOf(ch);
          s = s + shiftAlphaS.charAt(pos);
        } else {
          s = s + input.charAt(i);
        }
      }
    return s;
  }

}
