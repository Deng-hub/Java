package Map;

import java.util.HashMap;
import java.util.Map;

/*
java.util.Map<K,V>集合
Map接口
Map集合的特点：
1.是一个双列集合，一个元素包含两个值（一个KEY,一个VALUE);
2.kEY和VALUE的数据类型可相同也可不同
3.Map中的元素，kEY是不能重复的，VALUE可允许重复
4.Map集合中的kEY和VALUE是一一对应的
java.util.HashMap<k,v>集合 implements Map<k,v>接口
HashMap集合的特点:
1.HashMap集合底层是哈希表，查询的速度非常快
JDK1.8之前：数组+单项链表
JDK1.8之后：数组+单项链表/红黑树（链表长度超过8）；提高查询速度
2.hashMap集合是一个无序的集合，存储元素和取出元素的顺序有可能不一样
java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
LinkedHashMap的特点：
1.LinkedHashMap集合底层是 哈希表+链表
2.LinkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序是一致的
 */
public class Map_Class {
    public static void main(String[] args) {
//        show01();
//        show02();
//        show03();
        show04();
    }
    /*
    public V put(K key,V value); 吧置顶的键与指定的值添加到Map集合中。
    返回值：v
    存储键值对的时候，key不重复，返回值v是null
    存储键值对的时候，key重复,会使用新的value替换map中重复的value,返回被替换的value值
     */
    public static void show01(){
        //创建Map饥饿和对象，多态
        Map<String,String> map=new HashMap<>();
        String v1=map.put("李晨","范冰冰");
        System.out.println("v1:"+v1);//v1:null
        String v2=map.put("李晨","范冰冰2");
        System.out.println("v2:"+v2);//v2:范冰冰
        System.out.println(map);//{李晨=范冰冰2}

        map.put("冷锋","龙小云");
        map.put("杨过","小龙女");
        map.put("周星驰","张柏芝");
        map.put("刘德华","张敏");

        System.out.println(map);//{周星驰=张柏芝, 杨过=小龙女, 李晨=范冰冰2, 冷锋=龙小云, 刘德华=张敏}
    }

    /*
       public V remove(Object key):把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除的元素的值。
       返回值：v
       key存在，v返回被删除的值
       key不存在,v返回null
        */
    public static void show02(){
       //创建Map集合对象
        Map<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        System.out.println(map);//{林志玲=178, 赵丽颖=168, 杨颖=165}
        Integer i=map.remove("林志玲");
        System.out.println("i:"+i);//i:178

        System.out.println(map);//{赵丽颖=168, 杨颖=165}


        int i2=map.remove("林志颖");//自动拆箱 Exception in thread "main" java.lang.NullPointerException
//        Integer i2=map.remove("林志颖");
        System.out.println("i2:"+i2);//i2:null
        System.out.println(map);
    }

     /*
     public V get(Object key)根据指定的值，在Map集合中获取对应的值.
     返回值：
     key存在,返回对应的value值
     key不存在，返回null
      */
    private static void show03(){
        Map<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        Integer v1=map.get("杨颖");
        System.out.println("v1:"+v1);//v1:165

        Integer v2=map.get("迪丽热巴");
        System.out.println("v2:"+v2);//v2:null
    }
    /*
    boolean containsKey(Object key)判断集合中是否包含指定的值.
    包含返回true,不包含返回false
     */
    private static void show04(){
        Map<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        boolean b1=map.containsKey("杨颖");
        System.out.println(b1);//true
        boolean b2=map.containsKey("赵颖");
        System.out.println("b2"+b2);
        System.out.println(b2);//false
    }
}
