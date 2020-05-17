package Thread.Security.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
卖票案列出现了线程安全问题
卖出了不存在的票和重复的票

解决线程安全问题的第三种方法：使用Lock锁
java.util.conCurrent.locks.Lock接口
Lock实现提供了比使用synchronized方法和语句可获得的更广泛的锁操作.
Lock接口中的方法:
void lock()获取锁
void unlock()释放锁
java.util.concurrent.locks.ReentrantLock implements Lock接口

使用步骤：
1.在成员位置创建一个ReentrantLock对象
2.在可能会出现安全问题的代码调用Lock接口中的方法Lock获取锁
3.在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放资源
 */
public class RunnableImpl implements Runnable{
    //定义一个多线程共享的票源
    private int ticket=100;
    //设置线程任务:卖票
    @Override
    public void run() {
        //1.在成员位置创建一个ReentrantLock对象
        Lock l=new ReentrantLock();
        //使用死循环让卖票重复执行
        while (true){
//2.在可能会出现安全问题的代码调用Lock接口中的方法Lock获取锁
            l.lock();
            if(ticket>0){
                //提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName()+"-->"+ticket+"张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    //3.在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放资源
                    l.unlock();//无论程序是否异常都会释放
                }
            }
        }
    }

/*
 //设置线程任务:卖票
    @Override
    public void run() {
    //使用死循环让卖票重复执行
        while (true){
//2.在可能会出现安全问题的代码调用Lock接口中的方法Lock获取锁
            l.lock();
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
            //3.在可能会出现安全问题的代码后调用Lock接口中的方法unlock释放资源
            l.unlock();
        }
    }
    */
}
