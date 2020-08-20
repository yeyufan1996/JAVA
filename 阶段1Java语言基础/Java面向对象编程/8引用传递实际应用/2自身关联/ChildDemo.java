public class ChildDemo {
  public static void main(String[] args) {
    Human adult = new Human("张三", 20);
    Human childA = new Human("李四", 21);
    Human childB = new Human("王五", 22);
    childA.setCar(new car("吉利", 50000));
    childB.setCar(new car("大众", 60000));
    adult.setChild(new Human[] {childA, childB});
    for (int i = 0; i < adult.getChild().length; i++) {
      System.out.println(adult.getChild()[i].getInfo());
      System.out.println(adult.getChild()[i].getCar().getInfo());
    }
  }
}
