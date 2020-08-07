package Function;
/*
 * 需求：键盘录入两个数据，返回两个数中的较大值
 *
 * 两个明确：
 * 		返回值类型：int
 * 		参数列表：int a,int b
 * 需求：返回两个数中的较大值
 *
 * 两个明确：
 * 		返回值类型：int
 * 		参数列表：int a,int b
 */

public class FunctionDemo2 {
  public static int max(int a, int b) {
    return (a > b ? a : b);
  }

  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int max = max(a, b);
    System.out.println("最大值为:" + max);
  }
}
