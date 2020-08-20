public class ArrayExchangeDemo {
  public static void main(String[] args) {
    int[] data = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] temp = new int[data.length];
    int foot = temp.length - 1;
    for (int i = 0; i < data.length; i++) {
      temp[foot--] = data[i];
    }
    data = temp;
    printArray(data);
  }

  public static void printArray(int temp[]) {
    for (int tmp : temp) {
      System.out.println(tmp);
    }
  }
}
