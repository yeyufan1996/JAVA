public class TableDemo2 {
  public static void main(String[] args) {
    Classify class1 = new Classify(1, "母分类");
    Classify2 class2 = new Classify2(11, "子分类1");
    Classify2 class3 = new Classify2(22, "子分类2");
    Classify2 class4 = new Classify2(33, "子分类3");

    System.out.println(class1.getInfo());
    System.out.println(class2.getInfo());
    System.out.println(class3.getInfo());
    System.out.println(class4.getInfo());
    class1.setSclass(new Classify2[] {class2, class3, class4});
    System.out.println("--------------------------");
    for (int i = 0; i < class1.getSclass().length; i++) {
      System.out.println("\t-|" + class1.getSclass()[i].getInfo());
    }

    System.out.println("--------------------------");
    class2.setFclass(class1);
    class3.setFclass(class1);
    class4.setFclass(class1);
    System.out.println(class2.getFclass().getInfo());
    System.out.println(class3.getFclass().getInfo());
    System.out.println(class4.getFclass().getInfo());
  }
}
