package File.IndexDirectory;

import java.io.File;

/*
public String[] list():返回一个String数组，表示该File目录中的所有子文件或目录
public File[] listFiles():返回一个File数组，表示该File目录中的所有的子文件或目录。
注意：
list方法和listFiles方法遍历的是构造放法
如果构造方法中给出的目录地址不存在，会抛出空指针异常
如果构造方法中给出的路径不是一个目录，也会抛出空指针异常
 */
public class Index_Directory {
    public static void main(String[] args) {
        show01();
        show02();
    }

    /*
    public String[] list():返回一个String数组，表示该File目录中的所有子文件或目录
    遍历构造方法中给出的目录，会获取目录中所有文件/文件夹中的名称，把获取到的多个名称存储到一个String类型的数组中
    不能以文件结尾会报空指针异常 如：D:\JavaClass\MutiObj\src\a.txt
    隐藏文件/文件夹都能遍历
     */
    private static void show01() {
        File file = new File("D:\\JavaClass\\MutiObj\\src");
        String[] arr = file.list();
        for (String fileName : arr)
            System.out.println(fileName);
    }

    /*
    public File[] listFiles():返回一个File数组，表示该File目录中的所有的子文件或目录。
     遍历构造方法中给出的目录，会获取目录中所有的文件/文件夹.把文件/文件夹封装为File对象，多个File对象存储到File数组中
     */
    private static void show02() {
        File file = new File("D:\\JavaClass\\MutiObj\\src");
        File[] files=file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }
}
