class Shop {
  private long shopid;
  private String shopname;
  private double shopprice;
  private SUser users[];

  public Shop(long shopid, String shopname, double shopprice) {
    this.shopid = shopid;
    this.shopname = shopname;
    this.shopprice = shopprice;
  }

  public String getInfo() {
    return "商品信息 商品ID "
        + this.shopid
        + " "
        + "商品名称 "
        + this.shopname
        + " "
        + "商品价格"
        + this.shopprice;
  }

  public void setUsers(SUser[] users) {
    this.users = users;
  }

  public SUser[] getUsers() {
    return users;
  }
}
