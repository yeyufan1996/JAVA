package Function;

public class FunctionDemo3 {
  public static int equal(int a, int b) {
    if (a == b) {
      return 1;
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    int a = 2;
    int b = 3;
    if (equal(a, b) == 1) {
      System.out.println("两个数字相等");
    } else {
      System.out.println("两个数字不相等");
    }
  }
}
