package IO.ZiFuStream.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
字符输出流写数据的其他方法
    void write(char[] cbuf)写入字符数组
    abstract void write(char[] cbuf,int off,int len)写入字符数组的某一部分,off数组的开始索引，len写的字符个数
    void write(String str)写入字符串
    void write(String str,int off,int len)写入字符串的某一部分，off字符串的开始索引，len写的字符个数。
 */
public class Writer2_Class {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("D:\\Javafresh\\e.txt");
        char[] cs={'a','b','c','d','e','f'};
        //void write(char[] cbuf)写入字符数组
        fw.write(cs);

        //abstract void write(char[] cbuf,int off,int len)写入字符数组的某一部分,off数组的开始索引，len写的字符个数
        fw.write(cs,1,3);//bcd
        //void write(String str)写入字符串
        fw.write("一天过了一天");
        //void write(String str,int off,int len)写入字符串的某一部分，off字符串的开始索引，len写的字符个数。
        fw.write("勾选书法等级考试",2,3);//书法等
        fw.close();
    }
}
