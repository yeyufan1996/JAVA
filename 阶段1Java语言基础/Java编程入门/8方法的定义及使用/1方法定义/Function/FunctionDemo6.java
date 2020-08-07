package Function;
/*
 * 需求：写一个方法，传递一个整数(大于1)，在控制台打印1到该数据的值。
 *
 * 两个明确：
 * 		返回值类型：void
 * 		参数列表：int n
 */

public class FunctionDemo6 {
  public static void print(int a) {
    for (int i = 1; i <= a; i++) {
      System.out.println(i);
    }
  }

  public static void main(String[] args) {
    int a = 5;
    print(a);
  }
}
