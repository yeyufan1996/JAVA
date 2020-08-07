package Recursive;

public class RecursiveDemo2 {
  public static void main(String[] args) {
    System.out.println(factorial(3));
  }

  public static double factorial(double num) {
    if (num == 1) {
      return 1;
    }
    return num * factorial(num - 1);
  }
}
