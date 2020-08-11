class Person2 {
  private String name; // 人员姓名
  private int age; // 人的年龄

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

public class PackgeDemo2 {
  public static void main(String[] args) {
    Person2 per = new Person2(); // 声明并实例化对象
    per.setName("张三"); // 在类外部修改属性
    per.setAge(20); // 在类外部修改属性
    System.out.println(per.getName() + per.getAge());
  }
}
