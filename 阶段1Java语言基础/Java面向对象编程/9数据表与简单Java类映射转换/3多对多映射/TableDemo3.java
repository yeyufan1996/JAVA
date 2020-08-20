public class TableDemo3 {
  public static void main(String[] args) {
    SUser userA = new SUser(1, "老大");
    SUser userB = new SUser(2, "老二");
    SUser userC = new SUser(3, "老三");
    Shop shop1 = new Shop(11, "薯条", 5);
    Shop shop2 = new Shop(22, "面包", 10);
    Shop shop3 = new Shop(33, "牛奶", 20);
    userA.setShop(new Shop[] {shop1, shop2});
    userB.setShop(new Shop[] {shop2, shop3});
    userC.setShop(new Shop[] {shop1, shop3});
    shop1.setUsers(new SUser[] {userA, userC});
    shop2.setUsers(new SUser[] {userA, userB});
    shop3.setUsers(new SUser[] {userB, userC});
    System.out.println("根据商品查看用户");
    for (int i = 0; i < shop1.getUsers().length; i++) {
      System.out.println(shop1.getUsers()[i].getInfo());
    }
    System.out.println("------------------------------------------");
    for (int i = 0; i < shop2.getUsers().length; i++) {
      System.out.println(shop2.getUsers()[i].getInfo());
    }
    System.out.println("------------------------------------------");
    for (int i = 0; i < shop3.getUsers().length; i++) {
      System.out.println(shop3.getUsers()[i].getInfo());
    }
    System.out.println("------------------------------------------");
    System.out.println("根据用户查看商品");
    for (int i = 0; i < userA.getShop().length; i++) {
      System.out.println(userA.getShop()[i].getInfo());
    }
    System.out.println("------------------------------------------");
    for (int i = 0; i < userB.getShop().length; i++) {
      System.out.println(userB.getShop()[i].getInfo());
    }
    System.out.println("------------------------------------------");
    for (int i = 0; i < userC.getShop().length; i++) {
      System.out.println(userC.getShop()[i].getInfo());
    }
  }
}
