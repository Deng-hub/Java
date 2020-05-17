package IO.Serialize.ObjectOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
java.io.ObjectOutputStream extends OutputStream\
ObjectOutputStream:对象的序序列化流

构造方法：
ObjectOutputStream(OutputStream out)创建写入指定OutputStream的ObjectOutputStream
参数：
OutputStream out:字节输出流

特有的成员方法：
    void writeObject
使用步骤：
1.创建ObjectOutputStream对象，构造方法中传递字节输出流
2.使用ObjectOutputStream对象中的方法writeObject,把对象写入到文件中
3.释放资源
 */
public class ObjectOutputStream_Class {
    public static void main(String[] args) throws IOException {
        //1.创建ObjectOutputStream对象，构造方法中传递字节输出流
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\Javafresh\\f.txt"));
        //2.使用ObjectOutputStream对象中的方法writeObeject,把对象写入到文件中
        oos.writeObject(new Person("小美女",18));//此处age写18
        //3.释放资源
        oos.close();
    }
}
