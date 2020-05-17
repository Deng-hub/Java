package File.CommonlyUsedMethod;

import java.io.File;

/*
File类获取功能的方法
public String getAbsolutePath():返回此File的绝对路径名字符串
public String getPath():将此File转换为路径名字符串
public String getName():返回由此File表示的文件或目录的名称
public Long length()：返回由此File表示的文件的长度
 */
public class File_Method {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();
    }
    /*
    public String getAbsolutePath():返回此File的绝对路径名字符串
    获取的构造方法中传递的路径
    无论路径是绝对路径还是相对的，getAbsolutePath方法返回的都是绝对路径
     */
    private static void show01(){
        File f1=new File("D:\\JavaClass\\MutiObj\\a.txt");
        String absolutePath=f1.getAbsolutePath();
        System.out.println(absolutePath);//D:\JavaClass\MutiObj\a.txt
         File f2=new File("a.txt");
        String absolutePath2=f2.getAbsolutePath();
        System.out.println(absolutePath2);//D:\JavaClass\MutiObj\a.txt
    }
    /*
    public String getPath():将此File转换为路径名字符串
    获取的构造方法中传递的路径
    toString方法调用的就是getPath方法
    源码：
    public String toString(){
        return getPath();
    }
     */
    private static void show02(){
        File f1=new File("D:\\JavaClass\\MutiObj\\a.txt");
        String path1=f1.getPath();
        System.out.println(path1);//D:\JavaClass\MutiObj\a.txt
        File f2=new File("a.txt");
        String path2=f2.getPath();
        System.out.println(path2);//a.txt

        System.out.println(f1);//D:\JavaClass\MutiObj\a.txt
        System.out.println(f1.toString());//D:\JavaClass\MutiObj\a.txt
    }
    /*
    public String getName():返回由此File表示的文件或目录的名称
    获取的就是构造方法传递路径的结尾部分（文件/文件夹)
     */
    private static void show03(){
        File f1=new File("D:\\JavaClass\\MutiObj\\a.txt");
        String name1=f1.getName();
        System.out.println(name1);//a.txt

        File f2=new File("D:\\JavaClass\\MutiObj\\bb.txt");
        String name2=f2.getName();
        System.out.println(name2);//bb.txt
    }
    /*
    public Long length()：返回由此File表示的文件的长度
    获取的是构造方法指定的文件大小，以自己为单位
    注意：
    文件夹是没有大小概念的，不能获取文件夹的大小
    如果构造方法中给出的路径不存在，那么length方法返回0
     */
    private static void show04(){
    File f1=new File("D:\\JavaClass\\HaHa.java");
    long a=f1.length();
    System.out.println(a);//99字节
    File f2=new File("D:\\fjsdk\\d");//没有这个文件
    long b=f2.length();
    System.out.println(b);//0字节
    File f3=new File("D:\\Javafresh");//Javafresh空文件夹
    long c=f3.length();
        System.out.println(c);//0 注意：文件夹没有大小概念的
    }
}
