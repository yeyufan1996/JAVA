/** 字符串比较 */
public class StringEqualsDemo {
  public static void main(String[] args) {
    String strA = "AB";
    String strB = "Ab";
    String strC = "6";
    String strD = "5";
    System.out.println(strA.equals(strB)); // 区分大小写的相等比较
    System.out.println(strA.equalsIgnoreCase(strB)); // 不区分大小写的相等比较
    System.out.println(strC.compareTo(strD)); // 进行字符串大小比较
    System.out.println("HELLO".compareTo("HELLO")); // 进行字符串大小比较
    System.out.println(strD.compareToIgnoreCase(strC)); // 不区分大小写进行字符串大小比较
  }
}
