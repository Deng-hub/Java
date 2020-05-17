package File.CheckFunctionMethod;

import java.io.File;

/*
public boolean exists():此File表示的文件或目录是否实际存在
public boolean isDirectory():此File表示是否是目录
public boolean isFile():此File表示的是否是文件
 */
public class File_Check {
    public static void main(String[] args) {
       // show01();
        show02();
    }
    /*
    public boolean exists():此File表示的文件或目录是否实际存在
    用户判断构造方法中的路径是否存在
    存在：true
    不存在：false
     */
    private static void show01(){
        File f1=new File("D:\\JavaClass\\MutiObj\\a.txt");
        System.out.println(f1.exists());//false
        File f2=new File("D:\\JavaClass\\SuperPk.java");
        System.out.println(f2.exists());//true
        File f3=new File("a.txt");//相对路径
        System.out.println(f3.exists());//false
    }
    /*
    c boolean isDirectory():此File表示是否是目录
    用于判断和构造方法中给定的路径是否以文件夹结尾
    存在：true
    不存在：false
    public boolean isFile():此File表示的是否是文件
    存在：true
    不存在：false
    注意：
    电脑的硬盘中只有文件/文件夹，两个方法是互斥的
    这两个方法使用前提，路径必须是存下的，否则都返回false
     */
    //不存在就没有必要获取
    private static void show02(){
        File f1=new File("D:\\JavaClass\\MutiObj\\a.txt");
        if(f1.exists()) {
            System.out.println(f1.isDirectory());
            System.out.println(f1.isFile());
        }
        File f2=new File("D:\\JavaClass\\SuperPk.java");
        if(f2.exists()){
            System.out.println(f2.isDirectory());//false
            System.out.println(f2.isFile());//true
        }
        File f3=new File("D:\\JavaClass\\Directory");
        if(f3.exists()){
            System.out.println(f2.isDirectory());//true
            System.out.println(f2.isFile());//false
        }
    }
}
