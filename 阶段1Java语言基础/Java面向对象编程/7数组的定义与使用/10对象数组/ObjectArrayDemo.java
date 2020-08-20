class ObjectArray {
  private String name;
  private int age;

  public ObjectArray(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getInfo() {
    return "姓名" + this.name + "年龄" + this.age;
  }
}

class ObjectArrayDemo {
  public static void main(String[] args) {
    ObjectArray per[] = new ObjectArray[3];
    per[0] = new ObjectArray("张三", 23);
    per[1] = new ObjectArray("李四", 24);
    per[2] = new ObjectArray("王五", 25);
    for (int i = 0; i < per.length; i++) {
      System.out.println(per[i].getInfo());
    }
  }
}
