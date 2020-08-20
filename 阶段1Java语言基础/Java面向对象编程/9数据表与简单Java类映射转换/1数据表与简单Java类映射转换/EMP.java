class EMP {
  private long empno; // 编号
  private String ename; // 姓名
  private String job; // 职位
  private double sal; // 基本工资
  private double comm; // 奖金
  private DEPT deptno; // 雇员属于哪个部门
  private EMP mgr; // 领导

  public EMP(long empno, String ename, String job, double sal, double comm) {
    this.empno = empno;
    this.ename = ename;
    this.job = job;
    this.sal = sal;
    this.comm = comm;
  }

  public void setDeptno(DEPT deptno) {
    this.deptno = deptno;
  }

  public DEPT getDeptno() {
    return this.deptno;
  }

  public void setMgr(EMP mgr) {
    this.mgr = mgr;
  }

  public EMP getMgr() {
    return this.mgr;
  }

  public String getInfo() {
    return "雇员信息 雇员编号="
        + this.empno
        + " "
        + "雇员姓名 "
        + this.ename
        + " "
        + "雇员工作 "
        + this.job
        + " "
        + "雇员工资 "
        + this.sal
        + " "
        + "雇员奖金 "
        + this.comm;
  }
  // set/get省略
}
