package Transfer;

public class TransferDemo {
  public static void main(String[] args) {
    // 定义变量
    int a = 10;
    int b = 20;
    System.out.println("方法外改变前");
    System.out.println("a:" + a + ",b:" + b); // a:10,b:20

    System.out.println("方法内改变前");
    change(a, b);
    System.out.println("方法内改变后");
    System.out.println("a:" + a + ",b:" + b);
    // a:10,b:20
  }

  public static void change(int a, int b) { // a=10,b=20
    System.out.println("a:" + a + ",b:" + b); // a:10,b:20
    a = b; // a=20;
    b = a + b; // b=40;
    System.out.println("a:" + a + ",b:" + b); // a:20,b:40
  }
}
