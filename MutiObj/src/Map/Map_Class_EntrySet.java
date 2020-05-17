package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合遍历的第二种方式
Map集合中的方法:
Set<Map.Entry<K,V>> entrySet()返回此映射中包含的映射关系的Set视图；
实现步骤：
1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来，存储到一个Set集合中
2.遍历Set集合，获取每一个Entry对象
3.使用Entry对象中的方法getKey和getValue()获取键与值
 */
public class Map_Class_EntrySet {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);

        //使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来，存储到一个Set集合中
        Set<Map.Entry<String,Integer>> set=map.entrySet();
        //遍历Set集合，获取每一个Entry对象
        //使用迭代器
        Iterator<Map.Entry<String,Integer>> it=set.iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer> entry=it.next();
            String s=entry.getKey();
            Integer b=entry.getValue();
            System.out.println(s+"="+b);
            /*
            林志玲=178
            赵丽颖=168
            杨颖=165

             */
        }
        System.out.println("--------------------------------");
        //增强for
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            String str=entry.getKey();
            Integer in=entry.getValue();
            System.out.println(str+"="+in);
        }
    }

}
