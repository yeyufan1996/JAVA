class DEPT {
  private long deptno; // 部门编号
  private String dname; // 部门名称
  private String loc; // 部门位置
  private EMP emps[]; // 一个部门有多个雇员

  public DEPT(long enpto, String ename, String loc) {
    this.deptno = enpto;
    this.dname = ename;
    this.loc = loc;
  }

  public void setEmps(EMP[] emps) {
    this.emps = emps;
  }

  public EMP[] getEmps() {
    return emps;
  }

  public String getInfo() {
    return "部门信息表-部门编号=" + this.deptno + " " + "部门名称 " + this.dname + " " + "部门位置 " + this.loc;
  }
  // set/get省略
}
