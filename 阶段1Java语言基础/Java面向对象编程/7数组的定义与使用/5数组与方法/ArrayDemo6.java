/** 通过方法修改数组内容 */
public class ArrayDemo6 {
  public static void main(String[] args) {
    int data[] = initArray();
    printArray(data);
    changeArray(data);
    System.out.println("*****修改后*****");
    printArray(data);
  }

  public static void changeArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] *= 2;
    }
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
