#JDK简介
Java语言属于编译型与解释型的开发语言,对于Java语言,若需要进行开发,则一定需要安装配置JDK. 

对于JDK而言,其本身也有一段自己的发展历史,主要有如下几个标志性版本:

+ 【1995】JDK1.0开发包发布,1996正式提供下载,标志Java的诞生 
+ 【1998】JDK1.2,Java而后改名为Java2
+ 【2005】推出了JDK1.5这个版本极具标志性,影响了未来十年 
+ 【2014】Java提供了JDK1.8版本,并支持了Lambda表达式,支持函数编程 
+ 【2017】Java提供了JDK1.9版本,提升稳定性 
+ 【2018】Java提供了JDK1.10版本,1.9的稳定版 目前最新JDK14
#JDK安装与配置
##JDK的安装
第一步:登录https://www.oracle.com/hk/downloads/，点击Java

![](http://galleryyeyufan.test.upcdn.net/20200422172732.png)

第二步:点击图中“Java (JDK) for Developers”可以进入到JDK的下载页面

![](http://galleryyeyufan.test.upcdn.net/20200422172801.png)
第三步:下载页面中首先看到的是目前JDK最新版本JDK14，点击右侧的“DOWNLOAD”按钮
![](http://galleryyeyufan.test.upcdn.net/20200422172846.png)
第四步:下载完成后正常安装即可
JDK的配置
右键“我的电脑”-->"属性"-->"高级系统设置"-->"高级"-->"环境变量" 
![](http://galleryyeyufan.test.upcdn.net/1596701049(1).png)
![](http://galleryyeyufan.test.upcdn.net/20200806160447.png)
![](http://galleryyeyufan.test.upcdn.net/20200806160510.png)

在系统变量里新建"JAVA_HOME"变量,变量值为JDK的安装路径


系统变量中找到Path变量 ,编辑并新建变量
`%JAVA_HOME%\bin;%JAVA_HOME%\jre\bin`
测试JDK环境配置
Win键+R键 打开运行，输入cmd，回车

输入java -version,回车

![](http://galleryyeyufan.test.upcdn.net/20200807083940.png)

出现上图说明配置OK