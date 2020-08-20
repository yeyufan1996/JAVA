class ArraySum {
  public static int sum(int... data) {
    int sum = 0;
    for (int tmp : data) {
      sum += tmp;
    }
    return sum;
  }
}

public class SumArrayDemo {
  public static void main(String[] args) {
    System.out.println(ArraySum.sum(1, 2, 3, 4));
    System.out.println(ArraySum.sum(new int[] {1, 2, 3}));
  }
}
