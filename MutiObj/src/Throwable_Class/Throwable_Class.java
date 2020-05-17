package Throwable_Class;

import java.io.IOException;

/*
Throwable类中定义了3个异常处理的方法
String getMessage()返回此 throwable的简短描述
String toString（）返回此 throwable的详细信息字符串。
void printStackTrace()JVM打印异常对象默认调用此方法，异常信息是最全面的
 */
public class Throwable_Class {
    public static void main(String[] args) {
        try {
            //可能产生异常的代码
            readFile("d:\\a.tx");
        }
        catch (IOException e){//try中抛出什么异常对象，catch就定义什么异常变量，用来接收这个异常对象

           /*
        Throwable类中定义了3个异常处理的方法
        String getMessage()返回此 throwable的简短描述
        String toString（）返回此 throwable的详细信息字符串。
        void printStackTrace()JVM打印异常对象默认调用此方法，异常信息是最全面的
            */

//            System.out.println(e.getMessage());//文件名的后缀名不对
//            System.out.println(e.toString());//重写Object类的toString方法  java.io.IOException:文件的后缀名不对
//            System.out.println(e);//java.io.IOException: 文件的后缀名不对

            e.printStackTrace();
            /*
            java.io.IOException: 文件名的后缀名不对
	        at Throwable_Class.Throwable_Class.readFile(Throwable_Class.java:38)
	        at Throwable_Class.Throwable_Class.main(Throwable_Class.java:15)
             */
        }
        System.out.println("后续代码");
    }
    /*
        如果传递的路径：不是.txt结尾
        那么我们就抛出io异常对象，告知方法的调用者，文件的后缀名不对
         */
    public static void readFile(String fileName) throws IOException {

        if(!fileName.endsWith(".txt")){
            throw new IOException("文件名的后缀名不对");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
