package Collection.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * java.util.Set接口extends Collection 接口
 * Set接口的特点：
 * 1.不允许存储重复元素
 * 2.没有缩影，没有索引的方法，也不能使用普遍的for循环遍历
 * HashSet与TreeSet集合是无序的集合（有可能存储和取出的数据不一样）
 * HashSet:
 * 1. 不允许有重复元素
 * 2.没有索引（不能使用普遍的for循环遍历）
 * 3.是一个无序的集合，存储元素和取出元素的顺序可能不一致
 * 4.底层是一个Hash表结构
 * 哈希值:是一个十进制的整数，由系统随机给出（就是对象的地址值，是一个逻辑地址，是模拟出来得到地址，不是数据实际的物理地址）
 * 再Object类中有一个方法，可以获取对象的哈希值
 * int hashCode() 返回该对象的哈希值.
 * hashCode方法的源码：
 * public native int hashCode();
 * native：代表该方法调用的是本地操作系统的方法
 */
public class HashSet_Class {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //使用add方法往集合添加元素
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        //使用迭代器遍历Set集合
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Integer n = (Integer) it.next();//为什么it.next显示是Object类型？
            System.out.println(n);
        }
        //使用增强for遍历Set集合
        System.out.println("---------------------");
        for (Integer i : set) {
            System.out.println(i);
        }
    }


}
