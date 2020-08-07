package Function;
/*
 * 需求：写一个方法，在控制台输出10次HelloWorld案例。
 *
 * 两个明确：
 * 		返回值类型：void
 * 		参数列表：无参数
 *
 * 如果一个方法没有明确的返回值类型，java提供了void进行修饰。
 *
 * void修饰的方法的调用：
 * 		A:单独调用
 */
public class FunctionDemo5 {
  public static void hello() {
    for (int i = 1; i <= 10; i++) {
      System.out.println("Hello World!");
    }
  }

  public static void main(String[] args) {
    hello();
  }
}
