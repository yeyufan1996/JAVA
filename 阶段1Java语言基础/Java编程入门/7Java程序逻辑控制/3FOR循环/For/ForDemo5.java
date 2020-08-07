package For;

/*
 * 需求：在控制台输出所有的”水仙花数”
 * 分析：
 * 		什么是水仙花数呢?
 * 			所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
 *			举例：153就是一个水仙花数。
 *			153 = 1*1*1 + 5*5*5 + 3*3*3
 *
 */

public class ForDemo5 {
  public static void main(String[] args) {
    for (int i = 100; i < 1000; i++) {
      int ge = i % 10;
      int shi = i / 10 % 10;
      int bai = i / 10 / 10 % 10;
      if (i == (ge * ge * ge + shi * shi * shi + bai * bai * bai)) {
        System.out.println(i);
      }
    }
  }
}
