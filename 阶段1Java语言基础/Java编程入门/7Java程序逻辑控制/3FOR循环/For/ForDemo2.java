package For;

/*
 * 需求：获取数据1-5和5-1
 */

public class ForDemo2 {
  public static void main(String[] args) {
    // 1-5
    for (int i = 1; i < 6; i++) {
      System.out.println(i);
    }
    System.out.println("-----------");
    // 5-1
    for (int i = 5; i >= 1; i--) {
      System.out.println(i);
    }
  }
}
