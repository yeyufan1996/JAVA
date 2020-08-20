// 声明一个图书类，其数据成员为书名,编号，书价，并拥有 静态数据成员册数，记录图书的册数
// 在构造方法中利用此静态变量为对象的编号赋值,在主方法中定义多个对象，求出总册数
class book {
  private int uid;
  private String title;
  private double price;
  private static int count = 0;

  public book(String title, double price) {
    this.uid = count + 1;
    this.title = title;
    this.price = price;
    count++;
  }

  public String getINFO() {
    return "编号" + this.uid + "书名" + this.title + "价格" + this.price;
  }

  public static int getCount() {
    return count;
  }
}

public class BookDemo {
  public static void main(String[] args) {
    book book1 = new book("Java", 19.9);
    book book2 = new book("Jsp", 9.9);
    book book3 = new book("Web", 29.9);
    System.out.println(book1.getINFO());
    System.out.println(book2.getINFO());
    System.out.println(book3.getINFO());
    System.out.println(book.getCount());
  }
}
