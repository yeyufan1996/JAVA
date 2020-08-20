/*数组的动态初始化
声明并初始化
数据类型 数组名称 []=new 数据类型[长度]
数据类型 [] 数组名称 =new 数据类型[长度]
数组的静态初始化
简化格式
数据类型 数组名称[] ={数据1，数据2，数据3}
完整格式
数据类型 数组名称[] =new 数据类型[]{数据1，数据2，数据3}*/
public class ArrayDemo {
  public static void main(String[] args) {
    int data[] = new int[3]; // 数组的动态初始化
    int[] date = new int[3]; // 数组的动态初始化

    String color[] = {"red", "blue"}; // 数组的静态初始化
    int num[] = new int[] {1, 2, 3}; // 数组的静态初始化
    for (int i = 0; i < num.length; i++) {
      System.out.println(num[i]);
    }
  }
}
