package FunctionalProgramming.RunnableInterface;

public class Test {
    public static void main(String[] args) {
        //创建runnable接口实现类
        RunnableImpl run=new RunnableImpl();
        Thread t=new Thread(run);
        t.start();

        //简化代码，使用匿名类部类
//        Runnable r=new Runnable(){
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName()+"新线程创建了");
//            }
//        };
//        new Thread(r).start();

        //简化代码不用再创建一个实现类
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建了");
            }
        }).start();
    }
}
