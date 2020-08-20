/** 编写并测试一个代表员工的Empolyee类 员工属性包括"编号","姓名","基本工资","薪水增长率” 包括计算薪水增长额 以及计算增长后的工资总额的方案 */
class Employee {
  private String code;
  private String name;
  private double salary;
  private double grow;

  public Employee() {
    this("1", "张三", 5000, 0.2);
  }

  public Employee(String code, String name, double salary, double grow) {
    this.code = code;
    this.name = name;
    this.salary = salary;
    this.grow = grow;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void setGrow(double grow) {
    this.grow = grow;
  }

  public String getName() {
    return name;
  }

  public double getGrow() {
    return grow;
  }

  public double getSalary() {
    return salary;
  }

  public String getCode() {
    return code;
  }

  public double cacSalaryGrow() {
    return this.salary * this.grow;
  }

  public double cacSalary() {
    return this.salary * (1 + this.grow);
  }
}

public class EmployeeDemo {
  public static void main(String[] args) {
    Employee stu = new Employee();
    System.out.println(stu.cacSalary());
  }
}
