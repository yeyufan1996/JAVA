class Classify2 {
  private long snumber; // 子分类ID
  private String name; // 子分类名称
  private Classify fclass; // 分类

  public Classify2(long snumber, String name) {
    this.snumber = snumber;
    this.name = name;
  }

  public void setFclass(Classify fclass) {
    this.fclass = fclass;
  }

  public Classify getFclass() {
    return fclass;
  }

  public String getInfo() {
    return "子分类表信息 子分类ID为 " + this.snumber + " " + "分类名称 " + this.name;
  }
  // get,set省略
}
