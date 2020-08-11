class Personthis2 {
  private String name;
  private int age;

  public Personthis2(String name, int age) {
    this.setName(name);
    setAge(age); // 加与不加都代表本类方法
  }

  public void tell() {
    System.out.println("姓名" + name + "年龄" + age);
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }
}

public class ThisDemo2 {
  public static void main(String[] args) {
    Personthis2 per = new Personthis2("张三", 20);
    per.tell();
  }
}
