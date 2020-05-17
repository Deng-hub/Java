package Collection;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * java.util.Iterator 迭代器
 * 对集合进行遍历
 * 有两个常用方法
 * boolean hasNext()如果仍有元素可以迭代，则返回true
 * 判断集合中有没有下一个元素，有就返回true没有返回false
 * E next()返回迭代的下一个元素
 * 取出集合中的下一个元素
 * Iterator迭代器，是一个接口，我们无法直接使用，需要使用Iterator接口的实现类对象，获取实现类的方法比较特殊
 * Collection接口中有一个方法，叫iterator(),这个方法返回的值是实现类对象
 * Iterator<E> iterator() 返回在此Collection的元素上进行迭代的迭代器
 * <p>
 * 迭代器的使用步骤
 * 1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
 * 2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
 * 3.使用Iterator接口中的方法next取出集合中的下一个元素
 */
public class Instrut_Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("姚明");
        coll.add("科比");
        coll.add("麦迪");
        coll.add("詹姆斯");
        coll.add("爱迪生");

        /*
        1.使用集合中的方法iterator（）获取迭代器的实现对象，能实现Iterator接口接收（多态)
        注意：
        Iterator<E>接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型
         */

        Iterator<String> it = coll.iterator();
//        boolean b=it.hasNext();
//        System.out.println(b);//true
//        String s=it.next();
//        System.out.println(s);//姚明
//
//        b=it.hasNext();
//        System.out.println(b);//true
//        String x=it.next();
//        System.out.println(x);//科比
//
//        b=it.hasNext();
//        System.out.println(b);//true
//        String y=it.next();
//        System.out.println(y);//麦迪
//
//        b=it.hasNext();
//        System.out.println(b);//true
//        String z=it.next();
//        System.out.println(z);//詹姆斯
//
//        b=it.hasNext();
//        System.out.println(b);//true
//        String w=it.next();
//        System.out.println(w);//爱迪生
//
//        b=it.hasNext();
//        System.out.println(b);//false
//        String o=it.next();
//        System.out.println(o);//Exception in thread "main" java.util.NoSuchElementException
        String s = "";
        while (it.hasNext()) {
            s += it.next() + " ";
        }
        System.out.println(s);

        for (Iterator<String> t = coll.iterator(); t.hasNext(); ) {
            String h = t.next();
            System.out.println(h);
        }

        String j = "";
        for (Object o : coll.toArray()) {
            j += o.toString() + " ";
        }
        System.out.println(j);
    }
}
