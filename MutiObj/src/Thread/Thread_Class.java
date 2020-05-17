package Thread;

import Thread.MutiThread.MyThread;

import java.util.concurrent.ThreadLocalRandom;

public class Thread_Class {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread_Class mt=new MyThread_Class();
        //调用方法start，开启新线程，执行run方法
        mt.start();//Thread-1
        new MyThread_Class().start();//Thread-4
        new MyThread_Class().start();//Thread-0
        new MyThread_Class().start();//Thread-2
        System.out.println(Thread.currentThread().getName());//main
    }

}
