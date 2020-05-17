package Recursive.FileFilterNickClass;

import Recursive.FileFilter.FileFilterImpl;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/*
递归查找后缀为.txt的文件
使用过滤器查找.txt文件
在File类中有两个和ListFiles重载的方法，方法的参数传递的就是过滤器
File[] listFiles(FileFilter filter)
 java.io.FileFilter接口：用于抽象路径名(File对象)的过滤器
 作用：用来过滤文件（File对象）
 抽象方法：用来过滤文件的方法
 boolean accept(File pathname)测试指定抽象路径名是否应该包含在某个路径列表中
 参数：
 File pathname()：使用ListFiles方法遍历目录，得到的每一个文件对象
File[] listFiles(FilenameFilter filter)
 java.io.FilenameFilter接口：实现此接口的类实现可用于过滤器文件名。
 作用：用于过滤文件名称
 抽象方法：用来过滤文件的方法
 accept(File dir,String name)测试指定文件是否应该包含在某一文件列表中
 参数：
 File dir构造方法中传递的被遍历的目录
 String name :使用ListFiles方法遍历目录，获取的每一个文件/文件夹的名称

 注意：
 两个过滤器接口是没有实现类的，需要我们自己写实现类，重写过滤的方法accept，在方法中自己定义过滤的规则
 */
public class Easier_Locate_File {
    public static void main(String[] args) {

        File file=new File("D:\\JavaClass\\Extra");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {
//        File[] files = dir.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File file) {
//                return file.isDirectory()||file.getPath().toLowerCase().endsWith("txt");
//            }
//        });
//        File[] files = dir.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return new File(dir,name).isDirectory()|| name.toLowerCase().endsWith("txt");
//            }
//        });
        File[] files = dir.listFiles(
           (file2,name) ->
                 new File(file2,name).isDirectory()|| name.toLowerCase().endsWith("txt")
            );
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file);
            }
            else {
                System.out.println(file);
            }

        }
    }
    }