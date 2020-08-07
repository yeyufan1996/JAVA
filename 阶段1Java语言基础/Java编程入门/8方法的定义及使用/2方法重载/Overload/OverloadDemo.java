package Overload;

/*
 * 方法重载：在同一个类中，出现了方法名相同的方法，这就是方法重载。
 * 方法重载特点：
 * 		方法名相同，参数列表不同。与返回值无关。
 * 		参数列表不同：
 * 			参数的个数不同。
 * 			参数对应的类型不同。
 * 注意：
 * 		在调用方法的时候，java虚拟机会通过参数列表的不同来区分同名的方法。
 */

public class OverloadDemo {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int result = sum(a, b); // 求和
    System.out.println("result:" + result);
    int c = 30;
    result = sum(a, b, c);
    System.out.println("result:" + result);
  }

  // 两个float类型的数据求和
  public static float sum(float a, float b) {
    return a + b;
  }

  // 三个整数的求和
  public static int sum(int a, int b, int c) {
    return a + b + c;
  }

  // 两个整数的求和
  public static int sum(int a, int b) {
    return a + b;
  }
}
