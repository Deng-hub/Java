package IO.Buffered.EfficiencyTest;

import java.io.*;

/*
文件复制练习：一读一写

明确：
    数据源：C:\Users\Fine\Pictures\Camera Roll
    数据目的地：E:\Apache24\htdocs\en.jpg
文件复制步骤：
1.创建字节缓冲输入流对象，构造方法中传递字节输入流
2.创建字节缓冲输出流对象，构造方法中传递字节输出流
3.使用字节缓冲输入流对象中的方法read,读取文件
4.使用字节缓冲流中的方法write，把读取的数据写入到内部缓冲区中
5.释放资源（会先把缓冲区中的数据，刷新到文件中）

 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        long s=System.currentTimeMillis();
        //1.创建字节缓冲输入流对象，构造方法中传递字节输入流
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\Users\\Fine\\Pictures\\Camera Roll\\en.jpg"));
        //2.创建字节缓冲输出流对象，构造方法中传递字节输出流
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("E:\\Apache24\\htdocs\\en.jpg"));
        //3.使用字节缓冲输入流对象中的方法read,读取文件
        //复制文件总共使用了58毫秒
      /*
        //一次读取一个字节写入一个字节的方式
        int len=0;
        while((len=bis.read())!=-1){
           bos.write(len);
        }
       */
      //复制文件总共使用了9毫秒

        int len=0;
        byte[] bytes=new byte[1024];
        while((len=bis.read(bytes))!=-1) {
            bos.write(bytes, 0, len);
        }

        bis.close();
        bos.close();
        long e=System.currentTimeMillis();
        System.out.println("复制文件总共使用了"+(e-s)+"毫秒");
    }
}
