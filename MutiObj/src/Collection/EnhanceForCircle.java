package Collection;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

/**
 * 增强for循环：底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写
 * 是jdj1.5之后出现的新特性
 * Collection<E> extends Iterable<E>:所有的单列集合都可使用增强for
 * public interface Iterable<T>实现这个接口允许对象成为"foreach"语句的目标.
 * <p>
 * 增强for循环：用来遍历集合和数组
 * <p>
 * 格式：
 * for(集合/数组数据类型 变量名：结合/数组名)
 * {
 * sout(变量名);
 * }
 */
public class EnhanceForCircle {

    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("小朋友");
        list.add("你是否");
        list.add("有很多");
        list.add("问号？");
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static void demo01() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
