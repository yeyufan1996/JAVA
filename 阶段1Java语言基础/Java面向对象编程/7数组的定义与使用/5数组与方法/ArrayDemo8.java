class ArrayUtil {
  private int sum;
  private int max;
  private int min;
  private double avg;

  public ArrayUtil(int[] arr) {
    this.sum = 0;
    this.max = arr[0];
    this.min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        this.max = arr[i];
      }
      if (arr[i] < min) {
        this.min = arr[i];
      }
      this.sum = sum + arr[i];
    }

    this.avg = this.sum / arr.length;
  }

  public int getSum() {
    return this.sum;
  }

  public int getMax() {
    return this.max;
  }

  public int getMin() {
    return this.min;
  }

  public double getAvg() {
    return this.avg;
  }
}

public class ArrayDemo8 {
  public static void main(String[] args) {
    int[] arr = new int[] {1, 2, 3, 4};
    ArrayUtil array = new ArrayUtil(arr);
    System.out.println("总和为:" + array.getSum());
    System.out.println("最大值为:" + array.getMax());
    System.out.println("最小值为:" + array.getMin());
    System.out.println("平均值为:" + array.getAvg());
  }
}
