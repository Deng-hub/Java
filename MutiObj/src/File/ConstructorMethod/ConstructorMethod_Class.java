package File.ConstructorMethod;

import java.io.File;

/*
File类的构造方法
File(String pathname)通过指定路径名字符串转换为抽象路径名来创建一个新File实列
参数：
String pathname:字符串的路径名称
路径可以是以文件结尾，也可以是以文件结尾
路径可以是相对路径，也可以是绝对路径
路径可以是存在，也可以是不存在
创建File对象，只是把字符串路径封装为File对象，不考虑路径的真假情况

File(String parent,String child)
    根据parent路径名字符串和child路径名字符串创建一个新File实列；
    参数：
    String pathname:字符串的路径名称
    路径可以是以文件结尾，也可以是以文件夹结尾
    路径可以是相对路径，也可以是绝对路径
    路径可以是存在，也可以是不存在

File(File parent,String child)根据parent抽取路径名和child路径名字符串创建一个File实列。
 把参数路径分成了两份
    F parent:父路径
    String child:子路径
    好处：
    父路径和子路径，可以单独书写，使用起来非常灵活；父路径和子路径都可以变化
    父路径是File类型，可以使用File的方法对路径进行一些操作，再使用路径创建对象
 */
public class ConstructorMethod_Class {
    public static void main(String[] args) {
//        show01();//C:\Users\itcast\IdeaProjects\shungyuan\a.txt d:\Users\itcast\IdeaProjects\shungyuan
//        show02("c:\\","a.txt");//c
//        show02("d:\\","a.txt");//d:\a.txt
        show03();//c:\hello.java
    }
    //File(String pathname)
    private static void show01(){
        File f1=new File("C:\\Users\\itcast\\IdeaProjects\\shungyuan\\a.txt");
        System.out.println(f1);//C:\Users\itcast\IdeaProjects\shungyuan\a.txt
        File f2=new File("C:\\Users\\itcast\\IdeaProjects\\shungyuan");
        System.out.println(f2);//C:\Users\itcast\IdeaProjects\shungyuan
    }

    /*
    File(String parent,String child)
    把参数路径分成了两份
    String parent:父路径
    String child:子路径
    好处：
    父路径和子路径，可以单独书写，使用起来非常灵活，父路径和子路径都可以变化
     */
    private static void show02(String parent,String child){
        File file=new File(parent,child);
        System.out.println(file);
    }
    //File(File parent,String child)
    private static void show03(){
        File parent=new File("c:\\");
        File file=new File(parent,"hello.java");
        System.out.println(file);
    }
}
