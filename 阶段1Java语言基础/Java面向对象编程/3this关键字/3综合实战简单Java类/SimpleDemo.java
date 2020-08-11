class Dept {
  private long deptno;
  private String dname;
  private String loc;

  public Dept() {}
  ;

  public Dept(long deptno, String dname, String loc) {
    this.deptno = deptno;
    this.dname = dname;
    this.loc = loc;
  }

  public String getInfo() {
    return "部门编号: " + deptno + " 部门名称: " + dname + " 部门位置: " + loc;
  }

  public void setDeptno(long deptno) {
    this.deptno = deptno;
  }

  public void setDname(String dname) {
    this.dname = dname;
  }

  public void setLoc(String loc) {
    this.loc = loc;
  }

  public long getDeptno() {
    return deptno;
  }

  public String getDname() {
    return dname;
  }

  public String getLoc() {
    return loc;
  }
}

public class SimpleDemo {
  public static void main(String[] args) {
    Dept dept = new Dept(10, "技术部", "北京");
    System.out.println(dept.getInfo());
  }
}
