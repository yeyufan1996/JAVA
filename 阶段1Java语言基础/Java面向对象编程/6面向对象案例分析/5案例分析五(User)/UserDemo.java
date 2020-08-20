/** 设计一个表示用户的User类,类中的变量有用户名,口令和记录用户个数的变量,定义类的三个构造方法，获取和设置口令的方法和返回类信息的方法 */
class User {
  private String name;
  private String passwd;
  private static int count = 0;

  public User() {
    this("NOID", "0");
  }

  public User(String name) {
    this(name, "123");
  }

  public User(String name, String passwd) {
    this.name = name;
    this.passwd = passwd;
    count++;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPasswd(String passwd) {
    this.passwd = passwd;
  }

  public String getName() {
    return name;
  }

  public String getPasswd() {
    return passwd;
  }

  public static int getCount() {
    return count;
  }

  public String getInfo() {
    return "用户名" + this.name + "密码" + this.passwd;
  }
}

public class UserDemo {
  public static void main(String[] args) {
    User userA = new User();
    User userB = new User("小强");
    User userC = new User("大强", "666");
    System.out.println(userA.getInfo());
    System.out.println(userB.getInfo());
    System.out.println(userC.getInfo());
    System.out.println(User.getCount());
  }
}
