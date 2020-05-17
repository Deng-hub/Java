package WrapperClass;

/**
 * 拆箱与装箱
 * 装箱：把基本类型的数据，包装到包装类中(基本类型数据->包装类)
 * 构造方法：
 * Integer(int value)
 * 构造一个新分配的Integer对象,他表示制定的int值.
 * Integer(String s)
 * 构造一个新分配的Integer对象，它表示String参数所指示的int值。
 * 传递的字符串，必须是基本类型的字符串，否则会抛出异常'100'正确,'a'抛出异常
 * 静态方法:
 * static Integer valueOf(int i)返回一个表示指定的Integer实例，
 * static Integer valueOf(String s)返回保存指定的String的值的对象
 * 拆箱：
 * 在包装类中取出基本类型的数据(包装类->基本数据类型的数据）
 * 成员方法：
 * int intValue()以int 类型返回该Integer的值。
 */
public class Wrap_1 {
    public static void main(String[] args) {
        //装箱
        //构造方法
        Integer in1 = new Integer(2);
        System.out.println(in1);
        Integer in2 = new Integer("1");
        System.out.println(in2);
        //静态方法
        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);
        //      Integer in4=Integer.valueOf("a");
        Integer in4 = Integer.valueOf("1");
        System.out.println(in4);
        //拆箱
        int i = in1.intValue();
        System.out.println(i);
    }
}
