/** 实现返回一个数组 */
public class ArrayDemo5 {
  public static void main(String[] args) {
    int data[] = initArray();
    printArray(data);
  }

  public static int[] initArray() {
    int arr[] = new int[] {1, 2, 3, 4, 5};
    return arr;
  }

  public static void printArray(int temp[]) {
    for (int tmp : temp) {
      System.out.println(tmp);
    }
  }
}
