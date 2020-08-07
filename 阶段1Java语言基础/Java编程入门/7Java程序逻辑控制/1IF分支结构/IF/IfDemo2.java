package IF;

/*
 * if语句格式2：
 * 		if(关系表达式) {
 * 			语句体1;
 * 		}else {
 * 			语句体2;
 * 		}
 *
 * 执行流程：
 * 		A:判断关系表达式的值是true还是false
 * 		B:如果是true，就执行语句体1
 * 		C:如果是false，就执行语句体2
 */

public class IfDemo2 {
  public static void main(String[] args) {
    System.out.println("开始");
    int a = 10;
    int b = 10;
    if (a == b) {
      System.out.println("a和b相等");
    } else {
      System.out.println("a和b不相等");
    }
  }
}
