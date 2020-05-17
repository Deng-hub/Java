package Collection.Set.HashSet;

import java.util.HashSet;

/*
Set集合不允许重复元素的原理
 */
//set集合在调用add方法的时候，add方法会调用元素的hashCode方法和equals方法判断元素是否重复
public class HashSet2_WhyNoRepeat {
    public static void main(String[] args) {
        //创建HashSet集合对象
        HashSet<String> set = new HashSet<>();//堆内存中开辟一块空间
        String s1 = "abc";
        String s2 = "abc";
        set.add(s1);//调用hashCode方法计算字符串的哈希值是多少在集合中有没有这个哈希值一样的元素发现没有就会把这个元素存放到数组之中
        set.add(s2);//调用hashCode方法计算字符串的哈希值是多少在集合中有没有这个哈希值一样的元素发现没有就会把这个元素存放到数组之中这个有相同哈希（hash冲突)
        // 会调用equals方法和哈希值相同的元素进行比较s2.equals(s1),返回true两个元素相同的哈希值相同equals方法true认定两个元素相同就不会把s2存储到集合中
        set.add("重地");//调用hashCode方法计算字符串的哈希值是多少在集合中有没有这个哈希值一样的元素发现没有就会把这个元素存放到数组之中
        set.add("通话");//调用hashCode方法计算字符串的哈希值是多少在集合中有没有这个哈希值一样的元素发现没有就会把这个元素存放到数组之中
        set.add("abc");//调用hashCode方法计算字符串的哈希值是多少在集合中有没有这个哈希值一样的元素发现没有就会把这个元素存放到数组之中这个有相同哈希（hash冲突)
        // 会调用equals方法和哈希值相同的元素进行比较"通话".equals("重地"),返回false两个不同元素的哈希值相同equals方法false认定两个元素相同就会把"通话"存储到集合中
        System.out.println(set);//重地，通话，abc
    }
}
