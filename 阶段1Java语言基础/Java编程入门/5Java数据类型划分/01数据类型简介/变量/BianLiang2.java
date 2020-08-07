package 变量;
/*
	变量定义注意事项：
		1:变量未赋值,不能直接使用
		2:变量只在它所属的范围内有效
		  变量属于它所在的那对大括号
		3:一行上可以定义多个变量,但是不建议
*/
public class BianLiang2 {
  public static void main(String[] args) {
    // 定义变量
    int a = 10;
    System.out.println(a);
    int b;
    b = 20; // 变量在使用前赋值都是可以的
    System.out.println(b);
    {
      int c = 100;
      System.out.println(c);
    }
    // System.out.println(c); c定义在上面的括号内，只在上面括号内生效所以这里会报错
    int aa = 10, bb = 20, cc = 30;
  }
}
