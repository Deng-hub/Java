package Thread.SetThreadName;

public class SetThreadName_Class {
    //开启多线程
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.setName("小强");
        mt.start();
        //开启多线程
        new MyThread("旺财").start();
    }
}
