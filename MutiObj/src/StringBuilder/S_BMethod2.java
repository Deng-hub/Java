package StringBuilder;

/**
 * StringBuilder和String可以相互转换：
 * String->StringBuilder:可以使用StringBuilder的构造方法
 * StringBuilder(String str)构造一个字符串生成器，并初始化为指定的字符串内容。
 * StringBuilder->String:可以使用StringBuilder中的toString方法
 */
public class S_BMethod2 {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("str:" + str);
        StringBuilder bu = new StringBuilder(str);
        bu.append(" world");
        System.out.println("bu:" + bu);

        String s = bu.toString();
        System.out.println("s:" + s);
    }
}
