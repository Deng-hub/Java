package Generics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 泛型是一种未知的数据类型，当不知道数据类型的时候可以使用泛型
 * 也可以看作一个变量用了该接收数据类型
 * ArrayList在定义的时候都不知道里面会存储什么样的类型数据所以类型使用泛型
 * public class ArrayList<E>(){
 * public boolean add(E e){};
 * public E get(int index){};
 * }
 * 其中E代表未知的类型
 * 创建集合对象的时候就会确定泛型的数据类型
 * <p>
 * ArrayList<String> list=new AArrayList<>();
 * public class ArrayList<String>()
 * {
 * public boolean add(String e){};
 * public String get(int index);
 * }
 * 会把数据类型作为参数传递,把String赋值给泛型E
 */
public class GenericsTest {
    public static void main(String[] args) {
        show01();
        show02();
    }

    /*
    创建集合对象，不适用泛型
    好处：
    集合不使用泛型，默认的数据类型是Object类型，所以存储任意类型的数据
    弊端：
    集合不安全，会引发异常
     */
    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);

        //使用迭代器遍历list集合
        //获取迭代器
        Iterator it = list.iterator();
        while (it.hasNext()) {
            //取出元素也是object类型
            Object obj = it.next();
            System.out.println(obj);
            //想要使用String类特有的方法，length获取字符串长度；不能使用 多态 Object obj="abc"
            //需要向下转型
            //会抛出java.lang.ClassCastException类型转换类型异常，不能把Integer类型转换为String类型
            String s = (String) obj;
            System.out.println(s.length());
        }
    }

    /*
    创建集合对象使用泛型
    好处：
    1.避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型
    2.把运行期异常（代码运行之后会抛出的异常）提升到了编译期（写代码的时候就会报错）
    弊端：
    泛型什么类型就只能存储什么类型数据
     */
    private static void show02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        // list.add(1);//add(java.lang.String)in ArrayList cannot be applied to(int)
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
