class ArrayOrder {
  public static void sort(int[] data) {
    for (int x = 0; x < data.length; x++) {
      for (int i = 0; i < data.length - x - 1; i++) {
        if (data[i] > data[i + 1]) {
          int temp = data[i];
          data[i] = data[i + 1];
          data[i + 1] = temp;
        }
      }
    }
  }
}

public class OrderArray {
  public static void main(String[] args) {
    int[] data = new int[] {7, 1, 0, 8, 2, 5, 10, 4, 9, 3, 6};
    ArrayOrder.sort(data);
    printArray(data);
  }

  public static void printArray(int temp[]) {
    for (int tmp : temp) {
      System.out.println(tmp);
    }
  }
}
