package Collection.Set.HashSet.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
java.util.LinkedHashSet集合 extends HashSet集合
LinkedHashSet集合特点：
底层是一个哈希表（数组+链表/红黑树）+链表，多了一条链表（记录元素的存储顺序），保证元素有序
 */
public class LinkedHashSet_Class {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("itcast");
        System.out.println(set);//无序，[abc, www, itcast]

        HashSet<String> linked = new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("itcast");
        System.out.println(linked);//有序[www, abc, itcast]
    }
}
