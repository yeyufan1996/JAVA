/*定义一个描述员工信息的程序类
该类中提供:编号、姓名、部门、工资
在这个类中提供四个构造方法
 无参构造 编号定义为1000，姓名定义为无名氏
 单参构造 传递编号，姓名定义为新员工，部门定义为未定，工资为0
 三参构造 传递编号、姓名、部门，工资为2500
 四参构造 所有属性全部进行传递
 */
class Emp {
  private long empno; // 员工编号
  private String name; // 员工姓名
  private String dept; // 员工部门
  private double salary; // 员工工资

  public Emp() {
    this(1000, "无名氏", null, 0.0);
  }

  public Emp(long empno) {
    this(empno, "新员工", "未定", 0.0);
  }

  public Emp(long empno, String name, String dept) {
    this(empno, name, dept, 0.0);
  }

  public Emp(long empno, String name, String dept, double salary) {
    this.empno = empno;
    this.name = name;
    this.dept = dept;
    this.salary = salary;
  }

  public String getInfo() {
    return "雇员编号: "
        + this.empno
        + " 雇员姓名: "
        + this.name
        + " 所在部门: "
        + this.dept
        + " 基本工资: "
        + this.salary;
  }
}

public class Demo {
  public static void main(String[] args) {
    Emp emp = new Emp(7369L, "斯密斯", "财务部");
    System.out.println(emp.getInfo());
  }
}
