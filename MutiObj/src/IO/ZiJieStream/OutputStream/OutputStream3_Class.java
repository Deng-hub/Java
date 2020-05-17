package IO.ZiJieStream.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
追加写/续写：使用两个参数的构造方法
FileOutputStream(String name,boolean append)
创建一个向具有指定name的文件中写入数据的输出文件流
FileOutputStream(File file,boolean append)创建一个向指定File 对象表示的文件中写入数据的文件输出流
参数：
String name,File file:写入数据的目的地
boolean append:追加写开关 true:创建对象不会覆盖原文件，继续在文件的末尾追加数据、
true:创建对象不会覆盖原文件，继续在问及那的末尾追加数据
false：创建一个新文件，覆盖源文件

写换行：写换行符号
Windows:\r\n
Linux:/n
Mac:/r
 */
public class OutputStream3_Class {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\Javafresh\\a.txt",true);
        for (int i=1;i<=10;i++){
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }

        fos.close();
    }
}
