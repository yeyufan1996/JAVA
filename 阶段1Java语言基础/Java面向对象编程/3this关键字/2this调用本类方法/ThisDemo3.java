class PersonThis3 {
  private String name;
  private int age;

  public void tell() {
    System.out.println(name + age);
  }

  public PersonThis3() {
    System.out.println("****初始化成功****");
  }
  ;

  public PersonThis3(String name) {
    this();
    this.name = name;
  }
  ;

  public PersonThis3(String name, int age) {
    this(name);
    this.age = age;
  }
  // get,set忽略
}

public class ThisDemo3 {
  public static void main(String[] args) {
    PersonThis3 per = new PersonThis3("张三");
    per.tell();
  }
}
