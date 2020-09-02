/*字符串与字符数组的转换*/
public class StringCharDemo {
  public static void main(String[] args) {
    String str2 = "hellowworld";
    char[] result = str2.toCharArray(); // 将字符串变成字符数组
    for (int x = 0; x < result.length; x++) {
      result[x] -= 32;
    } // 全部变成大写
    String newStr = new String(result); // 字符数组转换为String类
    System.out.println(newStr); // 输出
  }
}
