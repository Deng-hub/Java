package Thread.MutiTel.TimeWaiting;
/*
进入到TimeWaiting(⏲计时等待）有两种方式
1.使用sleep（long m)方法，在毫秒值结束之后，线程睡醒进入Runnable/Blocked状态
2.使用wait(long m)方法，wait方法如果在毫秒值结束之后，还没有被notify唤醒，就会自动醒来，线程睡醒进入到Runnable/Blocked状态
唤醒的方法:
void notify()唤醒在此对象监视器上等待的单个线程
notifyAll()唤醒在此对象监视器上的所有线程
 */
public class TimeWaiting_Class {
    public static void main(String[] args) {
        //创建锁对象，以保持唯一
        Object obj=new Object();
        //创建一个顾客线程(消费者)
        new Thread(){
            @Override
            public void run() {
                // 一直等着买包子
                while(true){
                    //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                    synchronized (obj){
                        System.out.println("顾客1告知老板要的包子的种类和数量");
                        //调用wait方法，放弃cpu的执行，进入到WAITING状态（无线等待）
                        try{
                            obj.wait();
                        }
                        catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子已经做好了，顾客1开吃");
                        System.out.println("---------------------------");
                    }
                }
            }
        }.start();
        //创建一个顾客进程
        new Thread(){
            @Override
            public void run() {
                // 一直等着买包子
                while(true){
                    //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                    synchronized (obj){
                        System.out.println("顾客2告知老板要的包子的种类和数量");
                        //调用wait方法，放弃cpu的执行，进入到WAITING状态（无线等待）
                        try{
                            obj.wait();
                        }
                        catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子已经做好了，顾客2开吃");
                        System.out.println("---------------------------");
                    }
                }
            }
        }.start();
        //创建一个老板线程（生产者）：花了5秒做好包子，做好包子之后调用notify方法，唤醒顾客吃包子
        new Thread(){
            @Override
            public void run() {
                //一直等着做包子
                while(true){
                    try {
                        Thread.sleep(5000);//花了5秒做好包子
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                    synchronized (obj){
                        System.out.println("老板5s钟之后做好包子，告知顾客，可以吃包子了");
                        //做好包子之后调用notify方法，唤醒顾客吃包子
//                        obj.notify();//随机唤醒一个等待线程
                        obj.notifyAll();//唤醒所有等待线程
                    }
                }
            }
        }.start();

    }
}
