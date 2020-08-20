public class TableDemo {
  public static void main(String[] args) {
    // 根据关系进行类的定义
    DEPT dept = new DEPT(1, "总部", "上海");
    EMP empA = new EMP(1, "老三", "普通职员", 8000, 500.00);
    EMP empB = new EMP(2, "老二", "经理", 5000, 300.00);
    EMP empC = new EMP(3, "老大", "领导", 200, 100.00);
    empA.setDeptno(dept); // 雇员与部门的关联
    empB.setDeptno(dept); // 雇员与部门的关联
    empC.setDeptno(dept); // 雇员与部门的关联
    empA.setMgr(empB); // 雇员与领导的关联
    empB.setMgr(empC); // 雇员与领导的关联
    dept.setEmps(new EMP[] {empA, empB, empC});
    // 根据关系获取数据
    System.out.println(dept.getInfo()); // 部门的信息
    for (int i = 0; i < dept.getEmps().length; i++) {
      System.out.println("\t|-" + dept.getEmps()[i].getInfo());
      if (dept.getEmps()[i].getMgr() != null) {
        System.out.println("\t\t|-" + dept.getEmps()[i].getMgr().getInfo());
      }
    }
    System.out.println(
        "--------------------------------------------------------------------------------------------");
    System.out.println(empA.getDeptno().getInfo()); // 根据雇员来取部门信息
    System.out.println(empA.getMgr().getInfo()); // 根据雇员获取领导信息
  }
}
