public class CopyDemo {
  public static void main(String[] args) {
    int[] data1 = new int[] {1, 2, 3, 4, 5};
    int[] data2 = new int[data1.length];
    // System.arraycopy(data1, 1, data2, 3);
    copyArray(data1, 0, data2, 0, 3);
    printArray(data2);
  }

  public static void printArray(int[] temp) {
    for (int tmp : temp) {
      System.out.println(tmp);
    }
  }

  public static void copyArray(int[] src, int srcnum, int dsc[], int dindex, int len) {
    for (int i = 0; i < len; i++) {
      dsc[dindex++] = src[srcnum++];
    }
  }
}
