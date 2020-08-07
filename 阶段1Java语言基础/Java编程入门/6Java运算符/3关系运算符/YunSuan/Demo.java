package YunSuan;
/*
 * 关系运算符： ==,!=,>,>=,<,<= 关
 * 系运算符的结果是boolean类型
 *
 * 千万不要把==写成=
 */
public class Demo {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 10;
    System.out.println(a == b);
    System.out.println(a == c);
    System.out.println("-----------------");
    System.out.println(a != b);
    System.out.println(a != c);
    System.out.println("-----------------");
    System.out.println(a > b);
    System.out.println(a > c);
    System.out.println("-----------------");
    System.out.println(a >= b);
    System.out.println(a >= c);
    boolean bb = (a == b);
    System.out.println(bb);
  }
}
