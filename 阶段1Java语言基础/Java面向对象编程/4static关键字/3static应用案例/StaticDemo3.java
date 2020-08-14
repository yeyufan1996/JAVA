class Book {
  private String title;
  private static int count = 0;

  public Book(String title) {
    this.title = title;
    count++;
    System.out.println("第" + count + "本新的图书创建出来");
  }
}

public class StaticDemo3 {
  public static void main(String[] args) {
    new Book("Java");
    new Book("Jsp");
    new Book("Spring");
  }
}
