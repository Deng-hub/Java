package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * java.util.Collection接口
 * 所有单列集合的最顶层的接口
 * 定义的是所有单列集合中的共性方法
 * 所有的单列集合都可以使用共性的方法
 * 没有带索引的方法
 * public boolean add(E e); 把给定的对象添加到当前集合中
 * public void clear();清空集合中的所有元素
 * public boolean remove(E e)；把给定的对象字当前集合中删除
 * public boolean contains(E e);判断当前集合中是否包含给定的对象
 * public boolean isEmpty();判断当前集合是否为空；
 * public int size();返回集合中元素的个数
 * public Object[] tooArray() 把集合中的元素存储到数组中
 */
public class Instru_Collection {

    public static void main(String[] args) {
        //Collection coll = new ArrayList<>(); //new ArrayList<>();也可以使用所有任意collection的子类；如下：
        Collection coll = new HashSet<>();//不能存储重复的值.
        System.out.println(coll);
        /*
          public boolean add(E e); 把给定的对象添加到当前集合中，
          返回值是一个boolean值,一般都返回true，所以可以不用接收
         */
        boolean b1 = coll.add("张三");
        System.out.println("b1:" + b1);//b1:true
        System.out.println(coll);//张三
        coll.add("李四");
        coll.add("李四");
        coll.add("周六");
        coll.add("田七");
        System.out.println(coll);//[张三, 李四, 周六, 田七]
        /*
        public boolean remove(E e)把给定的对象在当前对象在当前集合中删除
        返回值是一个boolean值，集合中存在元素，删除元素，返回true
        集合不在元素中,返回false
         */
        boolean b2 = coll.remove("周六");
        System.out.println("b2:" + b2);//true

        boolean b3 = coll.remove("赵四");
        System.out.println("b3:" + b3);//false
        System.out.println(coll);//[张三, 李四, 田七]

        /*
        public boolean contains(E e);判断当前集合中是否包含给定的对象
        包含返回true
        不包含返回false
         */

        boolean b6 = coll.isEmpty();//集合为空返回true不为空返回false
        System.out.println(b6);//false

        /*
        public int size();返回集合中元素的个数
         */

        int size = coll.size();
        System.out.println(size);//3
        /*
        public Object[] toArray();把集合中的元素,存储到数组中.
         */
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        /*
        public void clear();清空集合中的元素,但是不删除集合,集合还存在
         */

        coll.clear();
        System.out.println(coll);//[]
        System.out.println(coll.isEmpty());//true
    }
}
