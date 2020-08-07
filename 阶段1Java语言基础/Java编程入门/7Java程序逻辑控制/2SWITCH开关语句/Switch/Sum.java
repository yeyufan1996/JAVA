package Switch;

/*
 * 求1-100之和。
 */

public class Sum {
  public static void main(String[] args) {
    int i = 1;
    int sum = 0;
    while (i <= 100) {
      sum = sum + i;
      i++;
    }
    System.out.println("SUM=" + sum);
  }
}
