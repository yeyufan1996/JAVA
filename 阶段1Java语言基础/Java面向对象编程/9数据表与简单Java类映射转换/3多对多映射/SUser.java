class SUser {
  private long userid;
  private String username;
  private Shop shop[];

  public SUser(long userid, String username) {
    this.userid = userid;
    this.username = username;
  }

  public String getInfo() {
    return "用户信息 用户ID " + this.userid + " " + "用户姓名 " + this.username;
  }

  public void setShop(Shop[] shop) {
    this.shop = shop;
  }

  public Shop[] getShop() {
    return shop;
  }
}
