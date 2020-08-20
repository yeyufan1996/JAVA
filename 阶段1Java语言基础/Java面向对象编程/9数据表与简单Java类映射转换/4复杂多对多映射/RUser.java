class RUser {
  private long userid;
  private String username;
  private Role roles[];

  public RUser(long userid, String username) {
    this.userid = userid;
    this.username = username;
  }

  public void setRoles(Role[] roles) {
    this.roles = roles;
  }

  public Role[] getRoles() {
    return roles;
  }

  public String getInfo() {
    return "用户信息 用户id" + this.userid + "用户名称" + this.username;
  }
}
