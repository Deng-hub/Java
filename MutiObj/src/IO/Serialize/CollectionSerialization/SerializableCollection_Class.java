package IO.Serialize.CollectionSerialization;

import java.io.*;
import java.util.ArrayList;

/*
练习：序列化集合
    当我们想再文件中保存多个对象的时候
    可以把多个对象存储到一个集合中
    对集合序列化和反序列化
分析：
    1.定义一个存储Person对象的集合ArrayList集合
    2.往ArrayList集合中存储Person对象
    3.创建一个序列化流ObjectOutputStream对象
    4.使用ObjectOutputStream对象中的方法writeObject对集合进行序列化
    5.创建一个反序列化ObjectInputStream对象
    6.使用ObjectInputStream对象中的方法readObject读取文件中保存的集合
    7.把Object类型的集合转换为ArrayList集合
    8.遍历ArrayList集合
    9.释放资源
 */
public class SerializableCollection_Class {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.定义一个存储Person对象的集合ArrayList集合
        ArrayList<Person> list=new ArrayList<Person>();
        //2.往ArrayList集合中存储Person对象
        list.add(new Person("张三",18));
        list.add(new Person("李四",19));
        list.add(new Person("王五",20));
        //3.创建一个序列化流ObjectOutputStream对象
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\Javafresh\\f.txt"));
        //4.使用ObjectOutputStream对象中的方法writeObject对集合进行序列化
        oos.writeObject(list);
        //5.创建一个反序列化ObjectInputStream对象
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\Javafresh\\f.txt"));
        //6.使用ObjectInputStream对象中的方法readObject读取文件中保存的集合
        Object o=ois.readObject();
        //7.把Object类型的集合转换为ArrayList集合
        ArrayList<Person> list2=(ArrayList<Person>)o;
        //8.遍历ArrayList集合'
        for (Person person : list2) {
            System.out.println(person);
        }
        //释放资源
        ois.close();
    }
}
