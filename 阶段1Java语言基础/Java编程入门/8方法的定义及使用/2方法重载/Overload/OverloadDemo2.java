package Overload;

/*
 * 需求：比较两个数据是否相等。参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型，
 * 在main方法中进行测试
 */

public class OverloadDemo2 {
  public static boolean equal(byte a, byte b) {
    System.out.println("byte");
    if (a == b) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean equal(short a, short b) {
    System.out.println("short");
    if (a == b) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean equal(int a, int b) {
    System.out.println("int");
    if (a == b) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean equal(long a, long b) {
    System.out.println("long");
    if (a == b) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    // 调用
    System.out.println(equal(10, 20));
    System.out.println("-------------");
    System.out.println(equal((byte) 10, (byte) 20));
    System.out.println("-------------");
    System.out.println(equal((short) 10, (short) 20));
    System.out.println("-------------");
    System.out.println(equal(10L, 20L));
  }
}
