/** 案例代码:字符串截取 */
public class StringSubDemo {
  public static void main(String[] args) {
    String str = "HelloWorld!";
    System.out.println(str.substring(3)); // 从第三个位置开始截取到末尾
    System.out.println(str.substring(0, 5)); // 只截取第0到第5个位置的字符串
    System.out.println("----------------");
    String str2 = "yeyufan-photo-张三.jpg"; // 字符串结构:"用户-photo-姓名.后缀"
    int beginIndex = str2.indexOf("-", str2.indexOf("photo")) + 1;
    int endndex = str2.lastIndexOf(".");
    System.out.println(str2.substring(beginIndex, endndex));
  }
}
