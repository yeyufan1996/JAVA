// 运行时运行时常量池
public class StringDemo8 {
  public static void main(String[] args) {
    String info = ".";
    String strA = "yeyufan.cn";
    String strB = "yeyufan" + info + "cn";
    System.out.println(strA == strB);
  }
}
