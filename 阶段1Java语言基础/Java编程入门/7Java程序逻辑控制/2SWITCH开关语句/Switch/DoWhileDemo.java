package Switch;

/*
 * do...while循环的基本格式：
 * 		do {
 * 			循环体语句;
 * 		}while(判断条件语句);
 * 扩展格式：
 * 		初始化语句;
 * 		do {
 * 			循环体语句;
 * 			控制条件语句;
 * 		}while(判断条件语句);
 * 执行流程：
 * 		A:执行初始化语句;
 * 		B:执行循环体语句;
 * 		C:执行控制条件语句;
 * 		D:执行判断条件语句，看是true还是false
 * 			如果是true，回到B继续
 * 			如果是false，就结束
 *
 */

public class DoWhileDemo {
  public static void main(String[] args) {
    int i = 1;
    int sum = 0;
    do {
      sum = sum + i;
      i++;
    } while (i <= 100);
    System.out.println(sum);
  }
}
