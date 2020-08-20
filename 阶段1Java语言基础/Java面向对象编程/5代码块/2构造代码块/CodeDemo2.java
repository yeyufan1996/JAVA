class personcode {
  public personcode() {
    System.out.println("[构造块]personcode构造方法执行");
  }

  {
    System.out.println("[构造块]personcode构造块执行");
  }
}

public class CodeDemo2 {
  public static void main(String[] args) {
    new personcode();
    new personcode();
    new personcode();
  }
}
