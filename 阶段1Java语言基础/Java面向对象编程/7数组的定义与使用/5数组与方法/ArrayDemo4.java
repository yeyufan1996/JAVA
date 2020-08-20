/** 实现一个数组的引用传递 */
public class ArrayDemo4 {
  public static void main(String[] args) {
    int data[] = new int[] {1, 2, 3, 4, 5};
    printArray(data);
  }

  public static void printArray(int temp[]) {
    for (int tmp : temp) {
      System.out.println(tmp);
    }
  }
}
