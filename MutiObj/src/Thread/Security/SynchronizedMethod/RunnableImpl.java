package Thread.Security.SynchronizedMethod;
/*
卖票案列出现了线程安全问题
卖出了不存在的票和重复的票

解决线程安全问题的第二种方法：使用同步方法
使用步骤：
1.把访问了共享数据的代码抽取出来，放到一个方法中
3.在方法上添加synchronized修饰符
格式：定义方法的格式
修饰符 synchronized 返回值类型 方法名(参数列表){
可能会出现线程安全问题的代码（访问了共享数据的代码)
}
 */
public class RunnableImpl implements Runnable{
    //定义一个多线程共享的票源
//    private int ticket=100;
    private static int ticket=100;
    //设置线程任务:卖票
    @Override
    public void run() {
        System.out.println("this"+this);//thisThread.Security.RunnableImpl@2d98a335
    //使用死循环让卖票重复执行
        while (true){
//           payTicket();
            payTicketStatic();
        }
    }

/*
静态的同步方法
锁对象是谁？
不能是this
this是创建对象之后产生的,静态方法优先于对象
静态方法的锁对象是本类的class属性-->class文件对象（反射)
 */
    public static synchronized void payTicketStatic(){
//        synchronized (this){
            if(ticket>0){
                //提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"-->"+ticket+"张票");
                ticket--;
            }
//        }
    }




    /*
    定义一个同步方法
    同步方法也会把方法内部的代码锁住
    只让一个线程执行
    同步方法的锁对象是谁？
    就是实现类对象 new Runnable()
    也就是this
     */
    public /*synchronized*/ void payTicket(){
        synchronized (this){
            if(ticket>0){
                //提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"-->"+ticket+"张票");
                ticket--;
            }
        }
    }
}
