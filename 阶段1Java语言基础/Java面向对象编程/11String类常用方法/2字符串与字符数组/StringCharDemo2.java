/**
 * 判断一个字符串中的数组是否全由数字组成 如果想要判断字符串中的每一位数据,最好将其转换为字符数组 可以判断每一个字符是否在数字的范围之内 ('0'~'9') 如果有一位不是数字,那么验证失败
 */
public class StringCharDemo2 {
  public static void main(String[] args) {
    /** 定义两个字符串 */
    String str = "123456";
    String str2 = "123hh456";
    if (isAllnum(str)) {
      System.out.println("全是数字组成");
    } else {
      System.out.println("不全是数字组成");
    }

    if (isAllnum(str2)) {
      System.out.println("全是数字组成");
    } else {
      System.out.println("不全是数字组成");
    }
  }
  // 写一个用于判断的方法
  public static boolean isAllnum(String str) {
    char[] c = str.toCharArray();
    boolean flag = true;
    for (int i = 0; i < c.length; i++) {
      if (c[i] < '0' || c[i] > '9') {
        flag = false;
      }
    }
    return flag;
  }
}
