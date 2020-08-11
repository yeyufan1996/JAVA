package Class;

public class YingYongDemo2 {
  public static void main(String[] args) {
    Person per = new Person(); // 声明并实例化对象
    per.name = "张三";
    per.age = 30;
    change(per); // 等价于 Person temp=per;
    per.tell(); // 调用方法
  }

  public static void change(Person temp) {
    temp.age = 80;
  }
}
