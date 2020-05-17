package Map.HashTable;

import java.util.HashMap;
import java.util.Hashtable;

/*
java.utils.HashTable<K,V>集合 implements Map<K,V>集合
HashTable:底层是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢
H爱上Map：底层是一个哈希表，是一个线程不安全的集合，是多线程的集合，速度快
HashMap集合（之前学的所有的集合):可以存储null值null键
HashTable集合：不能存储null值null键
HashTable和Vector集合一样，在jdk1.2版本之后被更先进的集合（HashMap,ArrayList)取代了
HashTable的子类Properties依然活跃在历史舞台
Properties集合是一个唯一和IP流相结合的集合
 */
public class HashTable_Class {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);
        System.out.println(map);//{null=null, b=null}

        Hashtable<String,String> table=new Hashtable<>();
//        table.put(null,"a");//Exception in thread "main" java.lang.NullPointerException
//        table.put("a",null);//Exception in thread "main" java.lang.NullPointerException
//        table.put("null",null);//Exception in thread "main" java.lang.NullPointerException
        System.out.println(table);

    }
}
