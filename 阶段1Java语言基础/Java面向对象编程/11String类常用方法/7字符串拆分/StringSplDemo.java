/** 案例代码:字符串拆分 */
public class StringSplDemo {
  public static void main(String[] args) {
    String str = "hello world hello moto";
    String str2 = "hello world hello moto";
    String[] result = str.split(" ");
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
    System.out.println("--------------");
    String[] result2 = str2.split(" ", 2);
    for (int i = 0; i < result2.length; i++) {
      System.out.println(result2[i]);
    }
  }
}
