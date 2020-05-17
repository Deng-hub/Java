package Thread.SingleThread;



public class Thread_Class {
    public static void main(String[] args) {
        Person p1=new Person("小强");
        p1.run();
        System.out.println(0/0);//Exception in thread "main" java.lang.ArithmeticException: / by zero 单线程出错后面不执行
        Person p2=new Person("旺财");
        p2.run();
    }
}
