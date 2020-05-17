package StringBuilder;

/**
 * String 底层是一个长度不可变的数组，被final修饰 private final byte[] value;
 * StringBuilder 底层也是一个数组，但长度可变。无final修饰符 byte [] value=new byte[16],如果超出了容器StringBuilder大小则自动扩容。
 * java.lang.StringBuilder类：字符串缓冲区。
 * StringBuilder()构造一个不需任何字符的字符串生成器,并且初始容量为16个字符。
 * StringBuilder(String str)构造一个字符串生成器，并初始化为指定的字符串内容。
 */
public class S_B {
    public static void main(String[] args) {
        //空参数构造方法
        StringBuilder bul = new StringBuilder();
        System.out.println("bul:" + bul);//bul1:""
        //带字符串的构造方法
        StringBuilder bul2 = new StringBuilder("abc");
        System.out.println("bul2:" + bul2);//bul2:abc
    }
}
