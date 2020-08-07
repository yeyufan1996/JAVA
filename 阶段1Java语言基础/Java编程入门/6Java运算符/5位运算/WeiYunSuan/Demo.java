package WeiYunSuan;
/*
 * 与：&
 * 或：|
 * 异或：^
 * 取反:~
 */
public class Demo {
  public static void main(String[] args) {
    int x = 2;
    int y = 7;
    System.out.println(x & y);
    System.out.println(x | y);
    System.out.println(x ^ y);
    System.out.println(~x);
    System.out.println(x << 2);
    System.out.println(x >> 2);
  }
}
