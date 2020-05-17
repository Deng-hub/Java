package File.Crea_Del;

import java.io.File;
import java.io.IOException;

/*
File类创建删除功能的方法
public boolean createNewFile():当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
public boolean delete():删除由此File表示的文件或目录
public boolean mkdir():创建由此File表示的目录
public boolean mkdirs():创建由此File表示的目录，包含任何必需但不逊在的父目录
 */
public class Create_Delete {
    public static void main(String[] args) throws IOException {
//        show01();
//        show02();
        show03();
    }
    /*
    public boolean createNewFile():当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
    创建文件的路径和名称在构造方法中给出（构造方法的参数）
    返回值：布尔值
    true：文件不存在.创建文件，返回true
    false:文件存在,不会创建,返回false
    注意：
    1.此方法只能创建文件，不能创建文件夹
    2.拆功能键文件的路径必须存在，否则会抛出异常
    public boolean createNewFile() throws IOException
    createNewFile声明抛出了IOException 我们调用这个方法，就必须处理这个异常，要么throws要么try...catch

     */
    private static void show01() throws IOException {
        File f1=new File("D:\\JavaClass\\a.txt");
        Boolean b1=f1.createNewFile();
        System.out.println(b1);//true

        File f2=new File("JavaClass\\c.txt");
        Boolean b2=f2.createNewFile();
        System.out.println(b2);//true

        File f3=new File("JavaCla\\新建文件");
        Boolean b3=f3.createNewFile();
        System.out.println(b3);//java.io.IOException: 系统找不到指定的路径
    }
    /*
    public boolean mkdir():创建单极文件夹
    public boolean mkdirs():创建单/多级空文件夹
    创建文件夹的路径和名称在构造方法中给出（构造方法的参数）
    返回值：布尔值
    true:文件不存在，创建文件夹，返回true
    false:文件夹存在，不会创建返回false;构造方法中给出的路径不存在返回false
    注意：
    1.此方法只能床建文件夹，不能创建文件
    2.创建文件的路径必须存在，否则会抛出异常
     */
    private static void show02(){
        File f1=new File("D:\\JavaClass\\aaa");
        Boolean b1=f1.mkdir();
        System.out.println("b1:"+b1);

        File f2=new File("D:\\JavaClass\\aaa\\bbb\\ccc\\ddd");
        Boolean b2=f2.mkdirs();
        System.out.println("b2:"+b2);//true

        File f3=new File("D:\\JavaClass\\aaa\\a.txt");//创建的还是目录名字叫a.txt
        Boolean b3=f3.mkdirs();
        System.out.println(b3);

        File f4=new File("D:\\JavaCla\\ccc");
        Boolean b4=f4.mkdirs();//不会抛出异常，路径不存在，不会创建
        System.out.println(b4);
    }
    /*
    public boolean delete():删除由此File表示的文件或目录
    此方法可以删除构造方法路径中给出的文件/文件夹
    返回值：布尔值
    true:文件/文件夹删除成功，返回true
    false:文件夹中有内容，不会删除返回false,构造方法中路径不存在false
    注意：
    delete方法时直接在硬盘删除文件/文件夹，不走回收站，删除要谨慎
     */
    private static void show03(){
    File f1=new File("D:\\JavaClass\\a.txt");
    boolean b1=f1.delete();
     System.out.println(b1);

    File f2=new File("D:\\JavaClass\\hha");
    boolean b2=f2.delete();
    System.out.println(b2);
    }
}
