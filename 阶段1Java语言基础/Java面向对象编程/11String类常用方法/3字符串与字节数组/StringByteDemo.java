/** 字符串与字节转换 */
public class StringByteDemo {
  public static void main(String[] args) {
    String str = "helloworld";
    byte[] bb = str.getBytes(); // 将字符串变为字节数组
    for (int i = 0; i < bb.length; i++) {
      bb[i] -= 32;
    }
    System.out.println(new String(bb));
    System.out.println(new String(bb, 0, 5));
  }
}
