package Function;
/*
 * 方法：就是完成特定功能的代码块。
 *
 * 定义格式：
 * 		修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2...) {
 * 			方法体;
 * 			return 返回值;
 * 		}
 * 格式解释：
 * 		A:修饰符 目前记住public
 * 		B:返回值类型 用于限定返回值的数据类型
 * 		C:方法名 一个名字，为了方便我们调用方法
 * 		D:参数类型 用于接收调用方法时传入的数据的类型
 * 		E:参数名  用于接收调用方法时传入的数据的变量
 * 		F:方法体 完成功能的代码
 * 		G:return 结束方法，把返回值带给调用者
 *
 * 方法的两个明确：
 * 		A:返回值类型 明确功能结果的数据类型
 * 		B:参数列表 明确有几个参数，以及参数的类型
 *
 * 案例：
 * 		求两个数和的案例。
 */
public class FunctionDemo {
  /*
   * 写一个方法，用于求和。
   * 两个明确： 返回值类型 int 参数列表 int a,int b
   */
  public static int sum(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    int a = 1, b = 1;
    System.out.println(sum(a, b));
  }
}
