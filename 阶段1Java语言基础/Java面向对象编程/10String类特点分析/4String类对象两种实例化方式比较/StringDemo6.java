public class StringDemo6 {
  public static void main(String[] args) {
    String strA = new String("yeyufan");
    String strB = new String("yeyufan").intern();
    System.out.println(strA == strB);
  }
}
