/*案例代码:字符串入池*/
public class StringInternDemo {
  public static void main(String[] args) {
    String str1 = "a";
    String str2 = "b";
    String str3 = "ab";
    String str4 = str1 + str2;
    String str5 = new String("ab");

    /*这个结果为true.
    因为字符串的值的内容相同 */
    System.out.println(str5.equals(str3));
    /*对比的是引用的地址是否相同.
    由于str5采用new String方式定义的,所以地址引用一定不相等,所以结果为false. */
    System.out.println(str5 == str3);
    /*当str5调用intern的时候,会检查字符串池中是否含有该字符串.
    由于之前定义的str3已经进入字符串池中,所以会得到相同的引用. */
    System.out.println(str5.intern() == str3);
    /*采用new创建的字符串对象不进入字符串池
    字符串相加的时候,都是静态字符串的结果会添加到字符串池,如果其中含有变量则不会进入字符串池中*/
    System.out.println(str5.intern() == str4);
  }
}
