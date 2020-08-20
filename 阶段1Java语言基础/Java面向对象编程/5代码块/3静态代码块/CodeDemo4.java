class Messager {
  public static String getcountry() {
    return "中国";
  }
}

class personcode3 {
  private static String country;

  static {
    country = Messager.getcountry();
    System.out.println(country);
  }
}

public class CodeDemo4 {
  public static void main(String[] args) {
    new personcode3();
  }
}
