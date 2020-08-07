package Int;

public class IntDemo2 {
  public static void main(String[] args) {
    int max = Integer.MAX_VALUE; // 获取int最大值
    int min = Integer.MIN_VALUE; // 获取int最小值
    System.out.println(max);
    System.out.println(min);
    System.out.println("----------------");
    // int型变量+int型常量=int型计算结果
    System.out.println(max + 1); // -2147483648
    System.out.println(min - 1); // 2147483647
  }
}
