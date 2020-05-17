package Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List接口中带索引的方法
 * public void add(int index,E element); 将指定的元素和取出元素的顺序是一致的(存储123,取出123)
 * public E get(int index):返回集合中指定位置的元素
 * public E remove(int index)；移除列表中指定位置的元素，返回的是被移除的元素。
 * public E set(int index,E element);用指定元素替换集合中指定位置的元素，返回值的更新钱的元素.
 * 注意：
 * 操作索引的时候，一定要防止缩影越界异常
 * IndexOutOfBoundsException索引越界异常，集合会报
 * ArrayIndexOutOfBoundException：数组索引越界异常
 * StringIndexOutOfBoundsException:字符串索引越界异常
 */
public class List_Class {
    //创建一个List集合对象,多态
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        //打印集合
        System.out.println(list);//不是地址，而是[a, b, c, d, a]重写了toString()方法
        //public void add(int index,E element):将指定元素,添加到该集合中的指定位置上
        //在c和d之间添加一个itheima
        list.add(3, "itheima");
        System.out.println(list);
        //public E remove(int index)；移除列表中指定位置的元素，返回的是被移除的元素。
        String removeE = list.remove(2);
        System.out.println("被移除的元素·1：" + removeE);//被移除的元素
        System.out.println(list);//[a, b, itheima, d, a]

        //public E set(int index,E element);用指定元素替换集合中指定位置的元素，返回值的更新钱的元素.
        //把最后一个a,替换为A
        String setE = list.set(4, "A");
        System.out.println("被替换的元素" + setE);
        System.out.println(list);//[a, b, itheima, d, A]
        //list集合有三种遍历方式
        //public E get(int index):返回集合中指定位置的元素
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("------------------------");
        //使用迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("------------------------");
        //使用增强for
        for (String s : list) {
            System.out.println(s);
        }
        String r = list.get(5);
        System.out.println(r);//抛出异常Exception in thread "main" java.lang.IndexOutOfBoundsException
    }
}
