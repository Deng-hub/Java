package Recursive;

import java.io.File;
/*
需求：
遍历一个文件夹中的所有内容
即包括所有子文件夹中的文件的内容
 */
public class RecursivePrintFile {
    public static void main(String[] args) {
        File file=new File("D:\\JavaClass\\Extra");
        getAllFile(file);//不完全遍历，只遍历第一层
    }

    public static void getAllFile(File dir){
        File [] files=dir.listFiles();
        for (File file : files) {
            if(file.isDirectory()){
                getAllFile(file);
                System.out.println(file.getName()+"是目录");
            }
            System.out.println(file);
        }
    }
}
