package While;

/*
 * while循环语句的基本格式：
 * 		while(判断条件语句) {
 * 			循环体语句;
 * 		}
 * 扩展格式：
 * 		初始化语句;
 * 		while(判断条件语句) {
 * 			循环体语句;
 * 			控制条件语句;
 * 		}
 *
 */

public class WhileDemo {
  public static void main(String[] args) {
    // 输出10次HelloWorld
    int x = 10;
    while (x >= 1) {
      System.out.println("HelloWorld");
      x--;
    }
  }
}
