package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
.java.utils.Collections是集合工具类，用来对集合进行操作，部分方法如下：
public static <T> void sort(List<T> list,Comparator<? super T>)

Comparator和 Comparable的区别
Comparable：自己（this）和别人（参数）比较自己需要实现Comparable接口，重写比较的规则CompareTo方法
Comparator:相当与找一个第三方裁判，比较两个
 */
public class Collections3_Class {

    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01);

//        Collections.sort(list01,new Comparator<Integer>() {
//            //重写比较的规则
//            @Override
//            public int compare(Integer o1, Integer o2) {
////                return o1-o2;//升序排序
//                return o2-o1;//降序排序
//            }
//        });

        //重写比较的规则Lambda
        Collections.sort(list01, (o1, o2) -> {
//                return o1-o2;//升序排序
            return o2 - o1;//降序排序
        });
        System.out.println(list01);

        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("a迪丽热巴", 18));
        list02.add(new Student("古力娜扎", 20));
        list02.add(new Student("杨幂", 17));
        list02.add(new Student("b杨幂", 18));
//        Collections.sort(list02, new Comparator<Student>() {
//            @Override//按照年龄升序排序
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
//        System.out.println(list02);//[Student{name='杨幂', age=17}, Student{name='迪丽热巴', age=18}, Student{name='古力娜扎', age=20}]
        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按照年龄升序
                int result= o1.getAge() - o2.getAge();
                //如果两个人年龄相同，再使用姓名的首字母比较
                if(result==0){
                   result=o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list02);//[Student{name='杨幂', age=17}, Student{name='a迪丽热巴', age=18}, Student{name='b杨幂', age=18}, Student{name='古力娜扎', age=20}]
    }
}

