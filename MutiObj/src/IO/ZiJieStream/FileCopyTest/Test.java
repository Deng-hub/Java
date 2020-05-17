package IO.ZiJieStream.FileCopyTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
文件复制的练习：一读一写
明确：
数据源：C:\Users\Fine\Pictures\Camera Roll\en
数据的目的地：E:\Apache24\htdocs\en
文件复制的步骤
1.创建一个字节输入流对象，构造方法中绑定要读取的数据源
2.创建一个字节输出流对象，构造方法中绑定要写入的目的地
3.使用字节输入流对象中的方法read读取文件
4.使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
5.释放资源
 */
public class Test {
    public static void main(String[] args) throws IOException {
        long begin=System.currentTimeMillis();
        //1.创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis=new FileInputStream("C:\\Users\\Fine\\Pictures\\Camera Roll\\en.jpg");
        //2.创建一个字节输出流对象，构造方法中绑定要写入的目的地
        FileOutputStream fos=new FileOutputStream("E:\\Apache24\\htdocs\\en.jpg");


        //耗时14528ms
        //一次读取一个字节写入一个字节的方法
        //3.使用字节输入流对象中的方法read读取文件
       int len=0;
        while ((len=fis.read())!=-1){
         // 4.使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
            fos.write(len);
        }

/*
      //耗时28ms
        //使用数组缓冲读取多个字节，写入多个字节
        byte[] bytes=new byte[1024];
        //3.使用字节输入流对象中的方法read读取文件
        int len=0;//每次读取的有效字节个数
        while ((len=fis.read(bytes))!=-1){
        //4.使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
            fos.write(bytes,0,len);
        }

*/
        //5.释放资源(先关闭写的，后关闭读的）
        //写完了一定读完了，读完了不一定写完了
        fos.close();
        fis.close();
        long end=System.currentTimeMillis();
        System.out.println((end-begin)+"ms");
    }
}
