package Thread;
/*
获取线程的名称：
1.使用Thread类中的方法getName()
String getName()返回线程的名称
2.可以先获取到当前正在执行的线程，使用线程中的方法获取线程的名称
static Thread currentThread()返回对当前正在执行的线程对象的引用.
 */
//定义一个Thread类的子类
public class MyThread_Class extends Thread{
    //重写Thread类中的run方法,设置线程任务

    @Override
    public void run() {
//        String name=getName();
//        System.out.println(name);
//        System.out.println(new Thread().currentThread());
//        System.out.println(Thread.currentThread().getName());
        Thread th=Thread.currentThread();
        System.out.println(th);//Thread[Thread-1,5,main]
        String name=th.getName();
        System.out.println(name);//Thread-1
    }
}
