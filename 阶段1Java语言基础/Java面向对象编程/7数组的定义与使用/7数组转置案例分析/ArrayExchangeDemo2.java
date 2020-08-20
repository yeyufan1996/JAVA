public class ArrayExchangeDemo2 {
  public static void main(String[] args) {
    int[] data = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
    /*    int center = data.length / 2; // 确定转化的次数
    int head = 0; // 操作的角标
    int tail = data.length - 1; // 操作的角标
    for (int i = 0; i < center; i++) {
      int temp = data[head];
      data[head] = data[tail];
      data[tail] = temp;
      head++;
      tail--;
    }*/
    ExchangeAArray.Exchange(data);
    printArray(data);
  }

  public static void printArray(int temp[]) {
    for (int tmp : temp) {
      System.out.println(tmp);
    }
  }
}
