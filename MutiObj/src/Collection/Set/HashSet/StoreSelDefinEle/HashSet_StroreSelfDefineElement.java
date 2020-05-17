package Collection.Set.HashSet.StoreSelDefinEle;

import java.util.HashSet;

/*
HashSet存储自定义元素
set结合保证元素唯一
存储的元素（String,Integer,...,Student,Person...),必须重写hashCode方法和equals方法

要求：
    同名同年龄的人，视为同一个人，只能存储一次
 */
public class HashSet_StroreSelfDefineElement {
    //创建一个HashSet集合存储Person
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("小美女", 18);
        Person p2 = new Person("小美女", 18);
        Person p3 = new Person("小美女", 19);
        System.out.println(p1.hashCode());//764977973
        System.out.println(p2.hashCode());//381259350

        System.out.println(p1 == p2);//false
        System.out.println(p1.equals(p2));//false
        //没重写hashCode和equals方法
        //重写后p1.equals(p2）为true p1==p2为false 相同元素只有一个了

        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
