package IO.Serialize.ObjectInputStream;

import IO.Serialize.ObjectOutputStream.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
java.io.ObjectInputStream extends InputStram
ObjectInputStream:对象的反序列化流
作用：把文件中保存的对象，以流的方式读取出来使用

构造方法：
ObjectInputStream(InputStream in)创建从指定InputStream读取的ObjectInputStream
参数：
InputStream in:字节输入流
特有的成员方法：
Object readObject()
从 ObjectInputStream读取对象

使用步骤:
1.创建ObjectInputStream对象，构造方法中传递字节输入流
2.使用ObjectInputStream对象中的方法readObject读取保存对象的文件
3.释放资源
4.使用读取出来的对象（打印）

readObject 方法申明抛出了ClassNotFoundException（class文件找不到异常）
当不存在对象的class文件时抛出此异常
反序列化的前提：
1.类必须实现Serializable
2.必须存在类对应的class文件
 */
public class ObjectInputStream_Class {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.创建ObjectInputStream对象，构造方法中传递字节输入流
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\Javafresh\\f.txt"));
        //2.使用ObjectInputStream对象中的方法readObject读取保存对象的文件
        Object o=ois.readObject();
        //3.释放资源
        ois.close();
        //4.使用读取出来的对象（打印）
        System.out.println(o);
        Person p= (Person) o;//注意：此Person对象是序列化里面的Person对象
        System.out.println(p.getName()+p.getAge());//当序列化的成员变量加上static关键字时,此处age=0;
    }
}
