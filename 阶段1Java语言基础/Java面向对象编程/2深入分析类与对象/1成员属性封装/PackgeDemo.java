class Person {
  String name; // 人员姓名
  int age; // 人的年龄

  public void tell() {
    System.out.println("姓名" + name + "年龄" + age);
  }
}

public class PackgeDemo {
  public static void main(String[] args) {
    Person per = new Person(); // 声明并实例化对象
    per.name = "张三"; // 在类外部修改属性
    per.age = 18; // 在类外部修改属性
    per.tell(); // 调用方法
  }
}
