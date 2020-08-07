package YunSuan;
/*
++,--运算符：对变量做加1或者减1的操作
++或者--既可以放在变量的后面，也可以放在变量的前面
单独使用的时候，++或者--无论是放在变量的前面还是后面，结果一样
参与操作的时候：
如果++或者--在变量的后面，先拿变量参与操作，后变量做++或者--
如果++或者--在变量的前面，先变量做++或者--，后拿变量参与操作*/
public class MathDemo3 {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    ++x; // ++x首先需要自增1
    int result = x - y;
    y--; // 执行完之后减1
    System.out.println("x=" + x);
    System.out.println("y=" + y);
    System.out.println("result=" + result);
  }
}
