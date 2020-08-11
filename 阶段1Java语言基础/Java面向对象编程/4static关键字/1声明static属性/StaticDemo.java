class Country {
  private String name;
  private int age;
  static String country = "中华民国"; // 国家暂时不封装

  public Country(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getInfo() {
    return "姓名: " + this.name + "年龄: " + this.age + "国家: " + this.country;
  }
  // set,get忽略
}

public class StaticDemo {
  public static void main(String[] args) {
    Country A = new Country("张三", 20);
    Country B = new Country("李四", 24);
    Country C = new Country("王五", 25);
    Country.country = "中华人民共和国";
    System.out.println(A.getInfo());
    System.out.println(B.getInfo());
    System.out.println(C.getInfo());
  }
}
