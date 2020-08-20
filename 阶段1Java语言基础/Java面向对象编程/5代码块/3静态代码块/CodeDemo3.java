// 非主类中定义
class personcode2 {
  public personcode2() {
    System.out.println("[构造块]personcode构造方法执行");
  }

  static {
    System.out.println("[静态块]静态块执行");
  }

  {
    System.out.println("[构造块]personcode构造块执行");
  }
}

public class CodeDemo3 {
  public static void main(String[] args) {
    new personcode2();
    new personcode2();
    new personcode2();
  }
}
