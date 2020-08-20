/** 定义一个int数组,要求可以计算这个数组的总和，最大值,最小值，平均值 */
public class ArrayDemo7 {
  public static void main(String[] args) {
    int[] arr = new int[] {1, 2, 3, 4};
    System.out.println("总和为:" + sumArray(arr));
    System.out.println("最大值为:" + maxArray(arr));
    System.out.println("最小值为:" + minArray(arr));
    System.out.println("平均值为:" + avgArray(arr));
  }

  public static int sumArray(int arr[]) {
    int sum = 0;
    for (int temp : arr) {
      sum += temp;
    }
    return sum;
  }

  public static int maxArray(int arr[]) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  public static int minArray(int arr[]) {
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }

  public static double avgArray(int arr[]) {
    double avg = 0.0;
    avg = sumArray(arr) / arr.length;
    return avg;
  }
}
