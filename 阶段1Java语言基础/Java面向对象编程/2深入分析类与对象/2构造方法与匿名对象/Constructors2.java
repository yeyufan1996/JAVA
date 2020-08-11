class Person4 {
  private String name; // 人员姓名
  private int age; // 人的年龄
  // 方法名称与类名称相同,且无返回值
  public Person4() {
    name = "shh";
    age = 20;
  }

  public Person4(String n) {
    name = n;
    age = 20;
  }

  public Person4(String n, int a) {
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

  public void tell() {
    System.out.println(name + age);
  }
}

public class Constructors2 {
  public static void main(String[] args) {
    Person4 per = new Person4("张三", 20);
    Person4 per2 = new Person4("李四"); // 声明并实例化对象
    System.out.println(per.getName() + per.getAge());
    System.out.println(per2.getName() + per2.getAge());
  }
}
