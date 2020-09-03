/*案例代码:实现首字母大写*/
public class StringUpperDemo {
  public static void main(String[] args) {
    String str = "dasdaddd";
    System.out.println(Upper(str));
  }

  public static String Upper(String s) {
    if (s == null || "".equals(s)) {
      return s;
    }
    if (s.length() == 1) {
      return s.toUpperCase();
    }
    return s.substring(0, 1).toUpperCase() + s.substring(1);
  }
}
