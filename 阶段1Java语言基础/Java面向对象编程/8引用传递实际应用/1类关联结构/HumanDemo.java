class Human {
  private String name;
  private int age;
  private car car; // 一个人有一辆车
  private Human child[]; // 一个人有多个孩子

  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setChild(Human[] child) {
    this.child = child;
  }

  public Human[] getChild() {
    return this.child;
  }

  public void setCar(car car) {
    this.car = car;
  }

  public car getCar() {
    return car;
  }

  public String getInfo() {
    return "姓名：" + this.name + "年龄：" + this.age;
  }
}

class car {
  private String name;
  private double price;
  private Human human; // 车应该属于一个人

  public car(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public void setHuman(Human human) {
    this.human = human;
  }

  public Human getHuman() {
    return this.human;
  }

  public String getInfo() {
    return "汽车品牌" + this.name + "汽车价格" + this.price;
  }
}

public class HumanDemo {
  public static void main(String[] args) {
    Human human = new Human("张三", 20);
    car car = new car("宾利", 8000000.00);
    human.setCar(car); // 一个人有一辆车
    car.setHuman(human); // 车应该属于一个人
    System.out.println(human.getCar().getInfo());
    System.out.println(car.getHuman().getInfo());
  }
}
