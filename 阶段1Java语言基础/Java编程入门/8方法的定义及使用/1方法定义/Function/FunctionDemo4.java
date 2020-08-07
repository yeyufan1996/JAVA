package Function;
/*
 * 需求：返回三个数中的最大值
 *
 * 两个明确：
 * 		返回值类型：int
 * 		参数列表：int a,int b,int c
 */
public class FunctionDemo4 {
  public static int max(int a, int b, int c) {
    return a > b ? (a > c ? a : c) : (b > c ? b : c);
  }

  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int c = 3;
    int max = max(a, b, c);
    System.out.println("最大值为:" + max);
  }
}
