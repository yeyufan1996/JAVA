package Class;

public class Rubbish {
  public static void main(String[] args) {
    Person per1 = new Person(); // 声明并实例化对象
    Person per2 = new Person();
    per1.name = "张三";
    per1.age = 18;
    per2.name = "李四";
    per2.age = 19;
    per2 = per1; // 引用传递
    per2.age = 80;
    per1.tell(); // 进行方法调用
  }
}
