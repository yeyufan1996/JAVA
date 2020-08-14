class Book2 {
  private String title;
  private static int count = 0;

  public Book2() {
    this("NOTITLE-" + count++);
  }

  public Book2(String title) {
    this.title = title;
    // System.out.println("第" + count + "本新的图书创建出来");
  }

  public String getTitle() {
    return this.title;
  }
}

public class StaticDemo4 {
  public static void main(String[] args) {
    System.out.println(new Book2("Java").getTitle());
    System.out.println(new Book2("Jsp").getTitle());
    System.out.println(new Book2("Spring").getTitle());
    System.out.println(new Book2().getTitle());
  }
}
