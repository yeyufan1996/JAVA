/** 构造一个银行账户类，类的构成包括如下内容 数据成员用户的账户名称，用户的账户余额 方法包括开户 *查询余额 */
class Account {
  private String name;
  private String money;

  public void setName(String name) {
    this.name = name;
  }

  public void setMoney(String money) {
    this.money = money;
  }

  public String getName() {
    return name;
  }

  public String getMoney() {
    return money;
  }

  public Account(String name, String money) {
    this.name = name;
    this.money = money;
  }

  public Account() {}

  public String trash() {
    return this.money;
  }
}

public class AccountDemo {
  public static void main(String[] args) {
    Account ac = new Account("张三", "20000");
    System.out.println(ac.trash());
  }
}
