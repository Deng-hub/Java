package Thread.MutiThread;
/*
创建多线程程序的第一种方式
java.lang.Thread类：时描述线程的类，我们想要实现多线程程序，就必须继承Thread类

实现步骤:
1.创建一个Thread类的子类
2.在Thread类的子类中重写Thread类中的run方法，设置线程任务（开启线程要做什么）
3.创建Thread类的子类对象
4.调用Thread类中的方法start方法，开启新的线程，执行run方法
void start()使用线程开始执行，Java虚拟机调用线程的run方法.
结果时两个线程并发的进行，当选线程（main线程）和另一个线程（创建的新线程，执行其run方法）
多次启动一个线程是非法的，特别是当线程已经结束执行时，不能再重新启动
Java程序属于抢占式调度，哪个线程的优先级高，哪个线程先执行，同一个优先级，随机选择一个执行

 */
public class MutiThread_Class {
    public static void main(String[] args) {
       new  MyThread().start();
    }

}

