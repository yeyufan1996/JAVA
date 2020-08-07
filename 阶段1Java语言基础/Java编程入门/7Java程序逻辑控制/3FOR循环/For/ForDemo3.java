package For;

/*
 * 需求：求出1-5之间数据之和
 */

public class ForDemo3 {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 5; i++) {
      sum = sum + i;
    }
    System.out.println("SUM=" + sum);
  }
}
