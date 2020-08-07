#Java编程起步
范例:Java编写Hello World代码如下
```java
public class Hello{
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```
将其保存为Hello.java文件,Java程序需要经过两次处理后才能正常执行

+ 对源代码程序进行编译:javac hello.java
  + 利用JVM进行编译,编译出一套与平台无关的字节码文件
+ 在JVM上进行程序的解释执行:java hello
  + 解释的就是字节码文件,字节码文件的后缀是不需要些的

在Java程序开发中最基础的单元是类,所有的程序都必须封装在类中执行,类的基本定义语法如下

`[public] class 类名称｛｝`
在这个程序中,类的名称为hello,而类的定义有两种形式
+ public class 类名称｛｝
+ class 类名称｛｝

用public修饰的类文件名需要和类名称一致;在一个*.java文件中可以有多个class定义,且编译后形成不通的*.class文件

#开发工具
[下载地址](http://eclipse.org/)

**PS：选择工作空间（其实就是我们写的源代码所在的目录）**

**A:创建Java项目:点击File,选择New--Project**
![](http://galleryyeyufan.test.upcdn.net/20200422173524.png)
**B:弹出窗口中选择Java Project**

![](http://galleryyeyufan.test.upcdn.net/20200422173555.png)

**C:填写项目名称,其他默认即可 点击Finish**

![](http://galleryyeyufan.test.upcdn.net/20200422173636.png)

**D:在创建的项目上右键点,击New--Package来创建一个包**

![](http://galleryyeyufan.test.upcdn.net/20200422173713.png)

**:弹出窗口中填写包名,点击Finish**
![](http://galleryyeyufan.test.upcdn.net/20200422173739.png)


**:在创建的包上右键,点击New--Class来创建一个类**
![](http://galleryyeyufan.test.upcdn.net/20200422173812.png)


**G:弹出窗口中填写类名,点击Finish**
![](http://galleryyeyufan.test.upcdn.net/20200422173824.png)

###代码案例：HelloWorld
```JAVA
package HelloWorld;
public class HelloWorldDemo {
  public static void main(String[] args) {
     System.out.println("Hello World!!!");
  }
}
```
**A:将以上代码复制到右边工作区**
![](http://galleryyeyufan.test.upcdn.net/20200422173958.png)


**B:空白处右键点击Run As--Java Application**
![](http://galleryyeyufan.test.upcdn.net/20200422174031.png)


**C:下方控制台输出结果**

##Eclipse工作空间的基本配置
**A:行号的显示和隐藏-->在代码区域的最左边的空白区域,右键--Show Line Numbers**

![](http://galleryyeyufan.test.upcdn.net/fb2dc869f0de485d0ea37379e98c9f55_1-1.png)

**B:字体大小及颜色**

①Java代码区域的字体大小和颜色

**Window -- Preferences -- General -- Appearance -- Colors And Fonts -- Java -- Java Edit Text Font**

②:控制台

**Window -- Preferences -- General -- Appearance -- Colors And Fonts -- Debug -- Console font**

③:其他文件

**Window -- Preferences -- General -- Appearance -- Colors And Fonts -- Basic -- Text Font**

**C:窗口复原-->Window -- Perspective -- Reset Perspective**

![](http://galleryyeyufan.test.upcdn.net/4125b8ab138034fd9e237b35ecea2fe4_2-1.png)

**D:控制台Console窗口复原-->Window--Show View—Console**

##Eclipse中辅助键和快捷键的使用
常用辅助键和快捷键
内容辅助键然后 alt+/

main然后alt+/

syso然后alt+/

单行注释-->选中内容，"Ctrl+/".

多行注释-->选中内容，"Ctrl+Shift+/","Ctrl+Shift+\".

格式化    -->选中内容,"Ctrl+Shift+F".

###代码案例:快捷键
```JAVA
package HelloWorld;
/*
* 内容辅助键：alt+/
*      
A:main方法
*          
main,然后alt+/,回车
*      
B:输出语句
*          
syso,然后然后alt+/,回车
*  
* 快捷键：
*      
A:单行注释-->选中内容，"Ctrl+/".
*      多行注释-->选中内容，"Ctrl+Shift+/","Ctrl+Shift+\".
*      
B:格式化
*        
选中内容,"Ctrl+Shift+F".
*/
public class HelloWorld {
   public static void main(String[] args) {
       System.out.println("HelloWorld1");
       System.out.println("HelloWorld2");
       System.out.println("HelloWorld3");
       System.out.println("HelloWorld4");
       System.out.println("HelloWorld5");
   }
}
```