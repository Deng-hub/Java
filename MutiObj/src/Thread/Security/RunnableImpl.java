package Thread.Security;
/*
此卖票机制有问题
重复卖票：经过多个sleep方法轮回,此时三个线程一起执行则出现卖同一张票
卖负票：当三个线程都在sleep然后醒来的一个线程卖最后一张票卖了输出卖第一张票进行ticket--
ticket变为0，判断不进入内部语句，另一个线程醒来进行输出卖第0张票ticket--
ticket变为-1，判断不进入内部语句，第三个线程醒来输出卖第-1张票ticket--
ticket变为-1，判断不进入内部语句
 */
public class RunnableImpl implements Runnable{
    //定义一个多线程共享的票源
    private int ticket=100;

    //设置线程任务:卖票
    @Override
    public void run() {
    //使用死循环让卖票重复执行
        while (true){
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
