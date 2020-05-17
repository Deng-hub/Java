package IO.Print;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
java.io.PrintStream:打印流
    PrintStream 为其他输出流添加了功能，使他们能够方便地打印各种数据值表示形式
    PrintStream特点：
    1.只负责数据的输出，不负责数据的读取
    2.与其他输出流不同，PrintStream 永远不会抛出IOException
    3.有特有的方法：print println
    void print(任意类型的值)
    void print(任意类型的值并换行)

    构造方法:
    PrintStream(File file):输出的目的地是一个文件
    PrintStream(OutputStream out)：输出的目的地是一个字节输出流
    printStream(String fileName)：输出的目的地是一个文件路径
 PrintStream extends OutputStream
 继承自父类的方法：
    public void close（）：关闭此输出流并释放与此流相关的任何系统资源
    public void flush（）：刷新此输出流并强制任何缓冲的输出字节被写出
    public void write（byte[] b):将b.length字节从指定的字节数组写入此输出流。
    public void write（byte[] b,int off,int len):从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流
    public abstract void write (int b):将指定的字节输出流。
    注意：
    如果使用继承自父类的write方法写数据，那么查看数据的时候会查询编码表97-->a
    如果使用自己特有的方法print/println方法写数据写的数据原样输出97-->97
 */
public class PrintStream_Class {
    public static void main(String[] args) throws FileNotFoundException {
//        System.out.println("HelloWorld");
        //创建打印流PrintStream对象，构造方法中绑定要输出的目的地
        PrintStream ps;
        ps = new PrintStream("D:\\Javafresh\\a.txt");
        //如果使用继承自父类的write方法写数据，那么查看数据的时候会查询编码表97-->a
        ps.write(97);//a
        ps.println(97);//97
        ps.println("hello");//hello
        ps.println(false);//false
        ps.println(1.2);//1.2
        ps.println(8);//8
        //释放资源
        ps.close();
    }
}
