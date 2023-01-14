# 1、软件开发介绍
- **软件开发**
软件，即一系列按照特定顺序组织的计算机数据和指令的集合。有系统软
件和应用软件之分。

- **人机交互方式**
**图形化界面**(Graphical User Interface GUI)这种方式简单直观，使用
者易于接受，容易上手操作。
**命令行方式**(Command Line Interface CLI)：需要有一个控制台，输
入特定的指令，让计算机完成一些操作。较为麻烦，需要记录住一些
命令。


- **常用的DOS命令**
dir : 列出当前目录下的文件以及文件夹
md : 创建目录
rd : 删除目录
cd : 进入指定目录
cd.. : 退回到上一级目录
cd\: 退回到根目录
del : 删除文件
exit : 退出 dos 命令行

- 常用快捷键
 ← →：移动光标
 ↑ ↓：调阅历史操作命令
  Delete和Backspace：删除字符
---
# 2、计算机编程语言介绍

## 2.1 什么是计算机语言

- **语言**：是人与人之间用于沟通的一种方式。例如：中国人与中国人用普通话沟通。而中国人要和英国人交流，就要学习英语。

- **计算机语言**：人与计算机交流的方式。 如果人要与计算机交流，那么就要学习计算机语言。计算机语言有很多种。如：C ,C++ ,Java ,PHP , Kotlin，Python，Scala等

## 2.2 计算机语言发展
- 第一代语言
机器语言。指令以二进制代码形式存在。

- 第二代语言
汇编语言。使用助记符表示一条机器指令。

![在这里插入图片描述](https://img-blog.csdnimg.cn/99b25404c7fb40a5b13839c0776b1cac.png)
- 第三代语言：高级语言
 C、Pascal、Fortran面向过程的语言
  C++面向过程/面向对象
  Java跨平台的纯面向对象的语言
  .NET跨语言的平台
  Python、Scala…

# 3、Java语言概述

## 3.1 java语言概述
- 是SUN(Stanford University Network，斯坦福大学网络公司 ) 1995年推出的一
门高级编程语言。
- 是一种面向Internet的编程语言。Java一开始富有吸引力是因为Java程序可以
在Web浏览器中运行。这些Java程序被称为Java小程序（applet）。applet使
用现代的图形用户界面与Web用户进行交互。 applet内嵌在HTML代码中。
-  随着Java技术在web方面的不断成熟，已经成为Web应用程序的首选开发语言。

> 后台开发：Java、PHP、Python、Go、Node.js


## 3.2 java简史

 1991年 Green项目，开发语言最初命名为Oak (橡树)
 1994年，开发组意识到Oak 非常适合于互联网
 1996年，发布JDK 1.0，约8.3万个网页应用Java技术来制作
 1997年，发布JDK 1.1，JavaOne会议召开，创当时全球同类会议规模之最
 1998年，发布JDK 1.2，同年发布企业平台J2EE
 1999年，Java分成J2SE、J2EE和J2ME，JSP/Servlet技术诞生
 2004年，发布里程碑式版本：JDK 1.5，为突出此版本的重要性，更名为JDK 5.0
 2005年，J2SE -> JavaSE，J2EE -> JavaEE，J2ME -> JavaME
 2009年，Oracle公司收购SUN，交易价格74亿美元
 2011年，发布JDK 7.0
 2014年，发布JDK 8.0，是继JDK 5.0以来变化最大的版本
 2017年，发布JDK 9.0，最大限度实现模块化
 2018年3月，发布JDK 10.0，版本号也称为18.3
 2018年9月，发布JDK 11.0，版本号也称为18.9

## 3.3 java技术体系平台
| **Java SE(Java Standard Edition)标准版**                     |
| ------------------------------------------------------------ |
| 支持面向桌面级应用（如Windows下的应用程序）的Java平台，提供了完整的Java核心`API`，此版本以前称为J2SE |
| **Java EE(Java Enterprise Edition)企业版**                   |
| 是为开发企业环境下的应用程序提供的一套解决方案。该技术体系中包含的技术如`:Servlet 、Jsp`等，主要针对于Web应用程序开发。版本以前称为J2EE |
| **Java ME(Java Micro Edition)小型版**                        |
| 支持Java程序运行在移动终端（手机、PDA）上的平台，对Java API有所精简，并加入了针对移动终端的支持，此版本以前称为J2ME |
| **Java Card**                                                |
| 支持一些Java小程序（Applets）运行在小内存设备（如智能卡）上的平台 |

## 3.4 java在各领域的应用
**从Java的应用领域来分，Java语言的应用方向主要表现在以下几个方面：**

- **企业级应用**：主要指复杂的大企业的软件系统、各种类型的网站。Java的安全机制以及它的跨平台的优势，使它在分布式系统领域开发中有广泛应用。应用领域包括金融、电
信、交通、电子商务等。

- **Android平台应用**：Android应用程序使用Java语言编写。Android开发水平的高低
很大程度上取决于Java语言核心能力是否扎实。

- **大数据平台开发**：各类框架有Hadoop，spark，storm，flink等，就这类技术生态
圈来讲，还有各种中间件如flume，kafka，sqoop等等 ，这些框架以及工具大多数
是用Java编写而成，但提供诸如Java，scala，Python，R等各种语言API供编程。

-  **移动领域应用**：主要表现在消费和嵌入式领域，是指在各种小型设备上的应用，包括手机、PDA、机顶盒、汽车通信设备等。

## 3.5 Java语言的诞生
java之父**James Gosling**团队在开发”Green”项目时，发现C缺少垃圾回收系统，还有可移植的安全性、分布程序设计和多线程功能。最后，他们想要一种易于移植到各种设备上的平台。
Java确实是从C语言和C++语言继承了许多成份，甚至可以将Java看成是类C语言发展和衍生的产物。比如Java语言的变量声明，操作符形式，参数传递，流程控制等方面和C语言、C++语言完全相同。但同时，Java是一个纯粹的面向对象的程序设计语言，它继承了C++语言面向对象技术的核心。Java舍弃了C语言中容易引起错误的指针（以引用取代）、运算符重载（operator overloading）、多重继承（以接口取代）等特性，增加了垃圾回收器功能用于回收不再被引用的对象所占据的内存空间。JDK1.5又引入了泛型编程（Generic Programming）、类型安全的枚举、不定长参数和自动装/拆箱

## 3.6 主要特性
- **Java语言是易学的**。Java语言的语法与C语言和C++语言很接近，使得大多数程序员很容易学习和使用Java。

- **Java语言是强制面向对象的**。Java语言提供类、接口和继承等原语，为了简单起见，只支持类之间的单继承，但支持接口之间的多继承，并支持类与接口之间的实现机制（关键字为implements）。

- **Java语言是分布式的**。Java语言支持Internet应用的开发，在基本的Java应用编
程接口中有一个网络应用编程接口（java net），它提供了用于网络应用编程的类
库，包括URL、URLConnection、Socket、ServerSocket等。Java的RMI（远程
方法激活）机制也是开发分布式应用的重要手段。

- **Java语言是健壮的**。Java的强类型机制、异常处理、垃圾的自动收集等是Java程序
健壮性的重要保证。对指针的丢弃是Java的明智选择。

- **Java语言是安全的**。Java通常被用在网络环境中，为此，Java提供了一个安全机
制以防恶意代码的攻击。如：安全防范机制（类ClassLoader），如分配不同的
名字空间以防替代本地的同名类、字节代码检查。

- **Java语言是体系结构中立的**。Java程序（后缀为java的文件）在Java平台上被
编译为体系结构中立的字节码格式（后缀为class的文件），然后可以在实现这个
Java平台的任何系统中运行。

- **Java语言是解释型的**。如前所述，Java程序在Java平台上被编译为字节码格式，
然后可以在实现这个Java平台的任何系统的解释器中运行。

- **Java是性能略高的**。与那些解释型的高级脚本语言相比，Java的性能还是较优的。

- **Java语言是原生支持多线程的**。在Java语言中，线程是一种特殊的对象，它必须
由Thread类或其子（孙）类来创建。

# 4、Java程序运行机制及运行过程

## 4.1 java特点

 特点一：**面向对象**
两个基本概念：类、对象
三大特性：封装、继承、多态
- 特点二：**健壮性**
吸收了C/C++语言的优点，但去掉了其影响程序健壮性的部分（如指针、内存的申请与
释放等），提供了一个相对安全的内存管理和访问机制
- 特点三：**跨平台性**
跨平台性：通过Java语言编写的应用程序在不同的系统平台上都可以运行。“Write 
once , Run Anywhere”
原理：只要在需要运行 java 应用程序的操作系统上，先安装一个Java虚拟机 (JVM Java 
Virtual Machine) 即可。由JVM来负责Java程序在该系统中的运行。

**Java语言的特点：跨平台性**

因为有了JVM，同一个Java 程序在三个不同的操作系统中都可以执行。这
样就实现了Java 程序的跨平台性。
![在这里插入图片描述](https://img-blog.csdnimg.cn/ed7265c6a7bf4f0d9cc1e6cf501b077b.png)

## 4.2 Java两种核心机制

-  Java虚拟机 (Java Virtal Machine)
- 垃圾收集机制 (Garbage Collection)

### 4.2.1 核心机制—Java虚拟机

JVM是一个虚拟的计算机，具有指令集并使用不同的存储区域。负责执行指
令，管理数据、内存、寄存器。

对于不同的平台，有不同的虚拟机。

只有某平台提供了对应的java虚拟机，java程序才可在此平台运行

Java虚拟机机制屏蔽了底层运行平台的差别，实现了“**一次编译，到处运行**”

![在这里插入图片描述](https://img-blog.csdnimg.cn/cff46cd58b2644e28a5edb192f868152.png)

![在这里插入图片描述](https://img-blog.csdnimg.cn/2a43fbf04e4f45b5a470b011127333de.png)

### 4.2.2 核心机制—垃圾回收

- 不再使用的内存空间应回收—— 垃圾回收。
在C/C++等语言中，由程序员负责回收无用内存。
Java 语言消除了程序员回收无用内存空间的责任：它提供一种系统级线程跟踪存储空间的分配情况。并在JVM空闲时，检查并释放那些可被释放的存储空间。

- 垃圾回收在Java程序运行过程中自动进行，程序员无法精确控制和干预。

> Java程序还会出现内存泄漏和内存溢出问题吗？Yes!

# 5、java语言的环境搭建
1、明确什么是JDK, JRE
2、下载 JDK
3、安装 JDK
4、配置环境变量
5、path：windows系统执行命令时要搜寻的路径。
6、验证是否成功：javac java
7、选择合适的文本编辑器或 IDE 开发、

## 5.1 JDK、JRE、JVM关系
**什么是JDK，JRE？**
| JDK(Java Development Kit Java开发工具包)                     |
| ------------------------------------------------------------ |
| JDK是提供给Java开发人员使用的，其中包含了java的开发工具，也包括了JRE。所以安装了JDK，就不用在单独安装JRE了。 其中的开发工具：编译工具(javac.exe) 打包工具(jar.exe)等 |
| **JRE(Java Runtime Environment Java运行环境)**               |
| 包括Java虚拟机(JVM Java Virtual Machine)和Java程序所需的核心类库等，如果想要运行一个开发好的Java程序，计算机中只需要安装JRE即可。 |

> 简单而言，使用JDK的开发工具完成的java程序，交给JRE去运行
> ![在这里插入图片描述](https://img-blog.csdnimg.cn/c167b6ff0c8948bf82f7b13a44c62cc2.png)

![在这里插入图片描述](https://img-blog.csdnimg.cn/ebcffdc90b4d4807887404891d04410f.png)

## 5.2 环境搭建
具体搭建过程：
[2022最新版JDK1.8的安装教程、包含jdk1.8的提取码（亲测可用）](https://blog.csdn.net/weixin_43304253/article/details/125474543)

# 6、开发体验— HelloWorld
步骤：
1. 将 Java 代码编写到扩展名为 .java 的文件中。
2. 通过 javac 命令对该 java 文件进行编译。
3. 通过 java 命令对生成的 class 文件进行运行。
![在这里插入图片描述](https://img-blog.csdnimg.cn/4ba1549abd9a43d7a741f57bb8baf950.png)

## 6.1 步骤一：编写

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}
```
记事本 或者其它编辑器中写上如上代码，命名为HelloWorld.java
文件是存放java代码的文件，称为源文件。

## 6.2 步骤二：编译

 有了java源文件，通过编译器将其编译成JVM可以识别的字节码文件。
 在该源文件目录下，通过javac编译工具对HelloWorld.java文件进行编译。
 如果程序没有错误，没有任何提示，但在当前目录下会出现一个Test.class文
件，该文件称为字节码文件，也是可以执行的java的程序。

![在这里插入图片描述](https://img-blog.csdnimg.cn/b3fe19d81d804768900d99339773506d.png)
![在这里插入图片描述](https://img-blog.csdnimg.cn/4a59e2aab03147b187cff97fa2d274c4.png)

## 6.3 步骤三：运行
有了可执行的java程序(HelloWorld.class字节码文件)
通过运行工具java.exe对字节码文件进行执行。

![在这里插入图片描述](https://img-blog.csdnimg.cn/7b749fb27ca641859260ba6e7decf25c.png)


## 6.4 使用开发工具IDEA
使用相应的开发工具还是很方便的

```
package com.zyz;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/1/14 14:56
 * @Description:
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}

```

运行结果

![在这里插入图片描述](https://img-blog.csdnimg.cn/3891bee8a1624663a945dec2bca668eb.png)

---

![在这里插入图片描述](https://img-blog.csdnimg.cn/e050aa9dfe714945b2714568db13fe00.png)

# 7、 注释(Comment)
- 用于注解说明解释程序的文字就是注释。
- Java中的注释类型：
 单行注释
  多行注释
  文档注释 (java特有)
- 提高了代码的阅读性；调试程序的重要方法。
- 注释是一个程序员必须要具有的良好编程习惯。
- 将自己的思想通过注释先整理出来，再用代码去体现

## 7.1 注释类型

- 单行注释
格式： //注释文字

- 多行注释
格式： /* 注释文字 */

- 文档注释（Java特有）
格式：/**
@author 指定java程序的作者
@version 指定源文件的版本
*/
-  注释内容可以被JDK提供的工具 javadoc 所解析，生成一套以网页文件形
式体现的该程序的说明文档。

> 注：对于单行和多行注释，被注释的文字，不会被JVM（java虚拟机）解释执行。多行注释里面不允许有多行注释嵌套。


# 8、Java API文档
- API （Application Programming Interface,应用程序编程接口）是 Java 提供
的基本编程接口。

- Java语言提供了大量的基础类，因此 Oracle 也为这些基础类提供了相应的
API文档，用于告诉开发者如何使用这些类，以及这些类里包含的方法。
- 下载API：
http://www.oracle.com/technetwork/java/javase/downloads/index.html
Additional Resources-Java SE 8 Documentation下载。

![在这里插入图片描述](https://img-blog.csdnimg.cn/63521688dac8451e8ed8c33bcac8bed5.png)
**对应的aip文档已上传到对应的资料中**

# 9、良好的编码风格
-  正确的注释和注释风格
 使用文档注释来注释整个类或整个方法。
  如果注释方法中的某一个步骤，使用单行或多行注释。

-  正确的缩进和空白
 使用一次tab操作，实现缩进
  运算符两边习惯性各加一个空格。比如：2 + 4 * 5。

-  块的风格
 Java API 源代码选择了行尾风格

 ![在这里插入图片描述](https://img-blog.csdnimg.cn/edb772be6bf64995b5559ba3621f1424.png)