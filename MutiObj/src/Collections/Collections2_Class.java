package Collections;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

/*
public static <T> void sort(List<T> list)将集合中元素按照默认规则排序
public static <T> void sort(List<T> list,Comparator<? super T>) 将集合中元素按照指定规则排序
注意:
sort(List<T> list)使用前提
被排序的集合里变存储的元素,必须实现Comparable,重写接口中的compareTo定义排序规则
return this.getAge()-o.getAge()按照年龄升序
return o.getAge()-this.getAge()按照年龄降序
 */
public class Collections2_Class {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01);//1,3,2

        //public static <T> void sort(List<T> list);将集合中的元素按照默认规则排序
        Collections.sort(list01);//默认是升序

        System.out.println(list01);//[1,2,3]

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("c");
        list02.add("b");
        System.out.println(list02);//[a,c,b]

        Collections.sort(list02);
        System.out.println(list02);//[a, b, c]

        ArrayList<Person> list03 = new ArrayList();
        list03.add(new Person("张三", 18));
        list03.add(new Person("李四", 20));
        list03.add(new Person("王五", 15));
        System.out.println(list03);

//        Collections.sort(list03);//没重写Comparable接口的compareTo即编译报错

        Collections.sort(list03);
        System.out.println(list03);//[Person{name='王五', age=15}, Person{name='张三', age=18}, Person{name='李四', age=20}]
    }
}
