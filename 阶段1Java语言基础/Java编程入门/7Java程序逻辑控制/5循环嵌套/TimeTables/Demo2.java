package TimeTables;

public class Demo2 {
  public static void main(String[] args) {
    int line = 5;
    for (int x = 0; x < line; x++) {
      for (int y = 0; y < line - x; y++) {
        System.out.print(" ");
      }
      for (int y = 0; y <= x; y++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
