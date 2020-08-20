public class ObjectArrayDemo2 {
  public static void main(String[] args) {
    ObjectArray per[] =
        new ObjectArray[] {
          new ObjectArray("张三", 20), new ObjectArray("李四", 21), new ObjectArray("王五", 22)
        };
    for (int i = 0; i < per.length; i++) {
      System.out.println(per[i].getInfo());
    }
  }
}
