/** 案例代码:字符串格式化 */
public class StringForDemo {
  public static void main(String[] args) {
    String name = "张三";
    int age = 18;
    double score = 98.765321;
    String str = String.format("姓名:%s,年龄:%d,成绩:%5.2f", name, age, score);
    System.out.println(str);
  }
}
