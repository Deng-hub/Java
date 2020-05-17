package Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
HashMap存储自定义类型键值
Map集合保证key是唯一的:
作为key的元素必须重写hashCode()方法和equals（）方法以保证key唯一
 */
public class HashMap_Class {
    public static void main(String[] args) {
//        show01();
        show02();
    }
    /*HashMap存储自定义类型键与值
        key:String类型
        String类重写了hashCode方法和equals方法，以保证key唯一
        value:Person类型
        value可以重复（同名同年龄的人视为同一个人)
  */
    private static void show01(){
        //创建HashMap集合
        HashMap<String,Person> map=new HashMap<>();
        //添加元素
        map.put("北京",new Person("张三",18));
        map.put("上海",new Person("李四",15));
        map.put("广州",new Person("王五",20));
        map.put("北京",new Person("赵六",18));
        //使用keySet加增强for遍历Map集合
        Set<String> set=map.keySet();
        for(String key:set){
            Person value=map.get(key);
            System.out.println(key+"--->"+value);
            /*
            注意：相同键会被第二个北京值{赵六，18}覆盖
            上海--->Person{name='李四', age=15}
            广州--->Person{name='王五', age=20}
            北京--->Person{name='赵六', age=18}
             */
        }
    }
    /*
    HashMap存储自定义类型键值
    key:Person类型
    Person类必须重写hashCode和equals方法以保证key唯一
    value:String类型
    可以重复
     */
    private static void show02(){
        HashMap<Person,String> map=new HashMap<>();
        map.put(new Person("女王",18),"英国");
        map.put(new Person("秦始皇",18),"秦国");
        map.put(new Person("普京",30),"俄罗斯");
        map.put(new Person("女王",18),"毛里求斯");
        //使用EntrySet和增强for遍历map集合
        Set<Map.Entry<Person,String>> set=map.entrySet();
        for(Map.Entry<Person,String> entry:set){
            Person p=entry.getKey();
            String s=entry.getValue();
            System.out.println(p+"--->"+s);
            /*
            Person{name='秦始皇', age=18}--->秦国
            Person{name='普京', age=30}--->俄罗斯
            Person{name='女王', age=18}--->毛里求斯
            Person{name='女王', age=18}--->英国
            注：不重写方法不能保证其键唯一性
             */

            /*
            在Person类中重写hashCode方法equals方法后：
            Person{name='女王', age=18}--->毛里求斯
            Person{name='秦始皇', age=18}--->秦国
            Person{name='普京', age=30}--->俄罗斯
             */
        }
    }
}
