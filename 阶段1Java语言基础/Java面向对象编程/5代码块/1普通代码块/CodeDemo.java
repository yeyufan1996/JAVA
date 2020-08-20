public class CodeDemo {
  public static void main(String[] args) {
    {
      int x = 10; // 局部变量
      System.out.println("x=" + x);
    }
    int x = 100; // 全局变量
    System.out.println();
    System.out.println("x=" + x);
  }
}
