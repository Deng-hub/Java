package Generics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 泛型的通配符：
 * ？：代表任意的数据类型
 * 使用方式:
 * 不能创建对象使用
 * 只能作为方法的参数使用
 */
public class WildcardsOfGeneric {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        printArray(list01);
        printArray(list02);
        //ArrayList<?> list03=new ArrayList<?>();//报错
    }

    /**
     * 定义一个方法，能遍历所有类型的ArrayList集合
     * 这时候我们不知道ArrayList集合是使用什么数据类型，可以泛型的通配符？来接收数据类型
     * 注意：泛型没有继承概念的
     */
    public static void printArray(ArrayList<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next().toString() + "  ");
        }
    }
}
