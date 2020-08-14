class Country2 {
  private String name;
  private int age;
  private static String country = "中华民国"; // 国家

  public Country2(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public static void setCountry(String c) {
    country = c;
  }

  public String getInfo() {
    return "姓名: " + this.name + "年龄: " + this.age + "国家: " + this.country;
  }
}

public class StaticDemo2 {
  public static void main(String[] args) {
    Country2.setCountry("中华人民共和国");
    Country2 per = new Country2("张三", 10);
    System.out.println(per.getInfo());
  }
}
