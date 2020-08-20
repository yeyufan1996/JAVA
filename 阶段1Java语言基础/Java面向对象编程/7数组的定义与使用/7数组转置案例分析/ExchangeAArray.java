class ExchangeAArray {
  public static void Exchange(int[] data) {
    int center = data.length / 2; // 确定转化的次数
    int head = 0; // 操作的角标
    int tail = data.length - 1; // 操作的角标
    for (int i = 0; i < center; i++) {
      int temp = data[head];
      data[head] = data[tail];
      data[tail] = temp;
      head++;
      tail--;
    }
  }
}
