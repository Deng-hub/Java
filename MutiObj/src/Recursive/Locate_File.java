package Recursive;

import java.io.File;
import java.util.Arrays;

/*
递归查找后缀为.txt的文件
 */
public class Locate_File {
    public static void main(String[] args) {

        File file=new File("D:\\JavaClass\\Extra");
        getAllFile(file);//不完全遍历，只遍历第一层
    }

    public static void getAllFile(File dir){
        File [] files=dir.listFiles();
        for (File file : files) {
            if(file.isDirectory()){
                getAllFile(file);
            }
            else{
                String s= file.toString();
                //调用String类中的方法endsWith判断字符串是否是以.txt结尾
                //toLowerCase字符串转小写
                boolean b=s.endsWith(".txt");
                if(b){
                    System.out.println(file.toString().toLowerCase());
                }
            }
        }
    }
}
