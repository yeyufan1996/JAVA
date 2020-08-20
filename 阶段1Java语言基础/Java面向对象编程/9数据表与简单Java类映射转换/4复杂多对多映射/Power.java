class Power {
  private long powerid;
  private String powername;
  private Role Role;

  public Power(long powerid, String powername) {
    this.powerid = powerid;
    this.powername = powername;
  }

  public String getInfo() {
    return "权限信息  权限id" + this.powerid + "权限名称" + this.powername;
  }

  public void setRole(Role role) {
    Role = role;
  }

  public Role getRole() {
    return Role;
  }
}
