package Class;

class Person { // 定义一个类
  String name; // 人员的姓名
  int age; // 人员的年龄

  public void tell() {
    System.out.println("姓名:" + name + " " + "年龄" + age);
  }
}

public class Demo {
  public static void main(String[] args) {
    Person per = new Person(); // 声明并实例化对象
    per.name = "张三";
    per.age = 30;
    per.tell(); // 调用方法

    Person per2 = null; // 声明对象
    per2 = new Person(); // 实例化对象
    per.name = "李四";
    per.age = 40;
    per.tell(); // 调用方法
  }
}
