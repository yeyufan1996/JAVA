package For;

/*
 * 需求：求出1-100之间偶数和
 */

public class ForDemo4 {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        sum = sum + i;
      }
    }
    System.out.println("SUM=" + sum);
  }
}
