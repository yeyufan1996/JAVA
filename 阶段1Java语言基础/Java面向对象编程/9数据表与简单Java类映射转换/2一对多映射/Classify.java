class Classify {
  private long number; // 分类ID
  private String name; // 分类名称
  private Classify2 sclass[]; // 子分类

  public Classify(long number, String name) {
    this.number = number;
    this.name = name;
  }

  public void setSclass(Classify2[] sclass) {
    this.sclass = sclass;
  }

  public Classify2[] getSclass() {
    return sclass;
  }

  public String getInfo() {
    return "分类表信息 分类ID为 " + this.number + " " + "分类名称 " + this.name;
  }
  // get,set省略
}
