class Personthis {
  private String name;
  private int age;

  public Personthis(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void tell() {
    System.out.println("姓名" + name + "年龄" + age);
  }
}

public class ThisDemo {
  public static void main(String[] args) {
    Personthis per = new Personthis("张三", 20);
    per.tell();
  }
}
