package Class;

public class YinYongDemo {
  public static void main(String[] args) {
    Person per = new Person(); // 声明并实例化对象
    per.name = "张三";
    per.age = 30;
    Person per2 = per; // 引用传递
    per2.age = 25;
    per.tell(); // 调用方法
  }

  public static void change(Person temp) {
    temp.age = 80;
  }
}
