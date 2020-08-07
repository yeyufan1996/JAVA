#认识Java
##Java语言发展史和平台概述
###Java语言发展史
James Gosling 1977年获得了加拿大卡尔加里大学计算机科学学士学位,1983年获得了美国卡内基梅隆大学计算机科学博士学位,毕业后到IBM工作,设计IBM第一代工作站NeWS系统,但不受重视,后来转至Sun公司.1990年,与Patrick,Naughton和Mike Sheridan等人合作“绿色计划”,后来发展一套语言叫做“Oak”,后改名为Java.

SUN(Stanford University Network，斯坦福大学网络公司)
![](http://galleryyeyufan.test.upcdn.net/20200423091235.png)
###什么是跨平台?
- 平台指的是操作系统(Windows，Linux，Mac)
- Java程序可以在任意操作系统上运行，一次编写到处运行
- 实现跨平台需要依赖Java的虚拟机 JVM （Java Virtual Machine）
###JVM,JRE,JDK概述
+ **JVM(JVM Java Virtual Machine)**
  + JVM是Java虚拟机,Java程序运行在虚拟机上,不同平台有自己的虚拟机，因此Java语言可以跨平台.
+ **JRE(Java Runtime Environment)**
  + 包括Java虚拟机和Java程序所需的核心类库等,如果只是想要运行一个开发好的Java程序,计算机中只需要安装JRE即可.JRE等于JVM加上类库.
+ **JDK(Java Development Kit)**
  + JDK是提供给Java开发人员使用的,其中包含了Java的开发工具,也包括了JRE.安装了JDK,就不用再安装JRE了.其中编译工具(javac.exe) ,打包工具(jar.exe).JDK等于JRE加上开发的工具.
#Java语言特点
+ Java是一个行业内通用的技术实现标准
  + Java本身算是半开源的产品,所以更多的厂商能够接触到Java的底层,使得开发更加透明
+ Java是一门面向对象的编程语言
  + 这样使得Java语法结构更加方便开发者接受,面向对象思想不断进行扩充
+ 提供有方便的内存回收机制
  + Java提供自动的内存回收操作,处理更方便(牵扯到优化方面)
+ 避免了复杂的指针的问题，使用更简单的引用来代替指针
  + 指针虽然是一种高效的内存处理模式,但是需要复杂的逻辑分析,Java在设计的时候充分考虑了这一点,所以开发者直接利用引用就可以简化指针的处理
+ Java支持多线程编程
  + 使得单位时间内，处理性能得到提升
+ Java提供高效的网络处理能力
  + 可以基于NIO实现更加高效的数据传输处理
+ Java具有良好的可移植性
  + 可以提升一个程序的适用范围
##Java的可移植性
Java语言中最大的特点在于其可移植性的支持,所谓的可移植性指的是同一个程序可在不同的操作系统之间部署,这样减少了开发的难度.在Java中如果想要实现可移植性的控制,主要依靠的是Java虚拟机,其是由硬件和软件模拟出来的计算机,所有的计算机只要又饿Java虚拟机的支持,就可以实现程序的执行,不同的操作系统上有不同版本的JVM
##Java应用程序运行机制
![](http://galleryyeyufan.test.upcdn.net/20200806115229.png)
Java程序的解释都要求放在Java虚拟机上处理
![](http://galleryyeyufan.test.upcdn.net/20200806115033.png)
所有的程序并不是直接运行在操作系统上,而是通过JVM执行,这样一来肯定要比在操作系统上执行程序速度慢,前期的确是一个问题,但是后来由于硬件技术的飞速发展,这些问题已经可以忽略了,但是仍然存在有JVM调优问题
