/** 设计一个Dog类,有名字，颜色，年龄等属性 定义构造方法来初始化类的这些属性 ，定义方法输出Dog信息 */
class Dog {
  private String name;
  private String color;
  private int age;

  public Dog(String name, String color, int age) {
    this.name = name;
    this.color = color;
    this.age = age;
  }

  public void setName() {
    this.name = name;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public int getAge() {
    return age;
  }

  public String getInfo() {
    return name + color + age;
  }
}

public class DogDemo {
  public static void main(String[] args) {
    Dog dog = new Dog("啤酒", "黄色", 2);
    System.out.println(dog.getInfo());
  }
}
