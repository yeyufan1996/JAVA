class Role {
  private long roleid;
  private String rolename;
  private Power powers[];
  private RUser users[];

  public Role(long roleid, String rolename) {
    this.roleid = roleid;
    this.rolename = rolename;
  }

  public void setPowers(Power[] powers) {
    this.powers = powers;
  }

  public Power[] getPowers() {
    return powers;
  }

  public void setUsers(RUser[] users) {
    this.users = users;
  }

  public RUser[] getUsers() {
    return users;
  }

  public String getInfo() {
    return "角色信息 角色id" + this.roleid + "角色名称" + this.rolename;
  }
}
