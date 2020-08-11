class Person3 {
  private String name; // 人员姓名
  private int age; // 人的年龄
  // 方法名称与类名称相同,且无返回值
  public Person3(String n, int a) {
    name = n;
    age = a;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }
}

public class Constructors {
  public static void main(String[] args) {
    Person3 per = new Person3("张三", 20); // 声明并实例化对象
    System.out.println(per.getName() + per.getAge());
  }
}
