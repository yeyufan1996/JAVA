public class ArrayDemo2 {
  public static void main(String[] args) {
    int data[] = new int[] {10, 20, 30};
    int temp[] = data;
    temp[0] = 99;
    for (int i = 0; i < data.length; i++) {
      System.out.println(data[i]);
    }
  }
}
