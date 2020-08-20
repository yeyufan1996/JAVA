public class SortDemo {
  public static void main(String[] args) {
    int data[] = new int[] {5, 3, 4, 1, 2};
    java.util.Arrays.sort(data);
    printArray(data);
  }

  public static void printArray(int[] temp) {
    for (int tmp : temp) {
      System.out.println(tmp);
    }
  }
}
