package Collection.List.LinkedList;

import java.util.LinkedList;

/**
 * java.util.LinkedList集合 implements list接口
 * LinkedList集合的特点:
 * 多线程，底层是一个链表结构，增删快，查询慢地址不连续
 * 里面包含大量操作首尾元素的方法
 * 注意：使用LinkedList集合特有的方法，不能使用多态
 * public void addFirst(E e):将指定元素插入此列表的开头
 * public void addLast(E e):将指定元素添加到此列表的结果
 * public void push(E e):将元素插入此列表所表示的堆栈
 * <p>
 * public E getFirst（）:返回此列表的第一个元素
 * public E getLast（）：返回此列表的最后一个元素
 * <p>
 * public E removeFirst（）:移除并返回此列表的最后一个元素
 * public E removeLast（）:移除并返回此列表的最后一个元素
 * public E pop():从此列表所表示的堆栈处弹出一个元素相当于removeFirst
 * <p>
 * public boolean isEmpty():如果列表不包含元素,则返回true
 */

public class LinkedList_Class {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");

        linked.clear();//清空集合元素

        //public boolean isEmpty()：如果列表不包含元素，则返回true
        if (linked.isEmpty()) {
            String first = linked.getFirst();//Exception in thread "main" java.util.NoSuchElementException
            System.out.println(first);//a
            String last = linked.getLast();//Exception in thread "main" java.util.NoSuchElementException
            System.out.println(last);//c
        }

        //public E getFirst（）:返回此列表的第一个元素
//        String first=linked.getFirst();//Exception in thread "main" java.util.NoSuchElementException
//        System.out.println(first);//a
//        String last=linked.getLast();//Exception in thread "main" java.util.NoSuchElementException
//        System.out.println(last);//c
    }

    private static void show01() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);//[a, b, c]
        //将指定元素插入此列表的开头
//        linked.addFirst("www");
        linked.push("www");
        System.out.println(linked);//[www, a, b, c]

        //public void addLast(E e):将指定元素添加到此列表的结果
        linked.addLast("com");
        System.out.println(linked); //[www, a, b, c,com]
    }
}
