package StringBuilder;

/**
 * public StringBuilder append()添加任意类型的字符串形式，并返回当前对象自身；
 */
public class S_BMethod {
    public static void main(String[] args) {


        StringBuilder bu = new StringBuilder();
        //使用append方法往StringBuilder中添加数据
        // append方法返回的是this，调用方法的对象bu.this==bu
        StringBuilder bu2 = bu.append("abc");//把bu的地址赋给了bu2
//        System.out.println(bu);//abc
//        System.out.println(bu2);//abc
//        System.out.println(bu==bu2);//比较的是地址
//
//        bu.append("abc");
//        bu.append(1);
//        bu.append(true);
//        bu.append(8.8);
//        bu.append("中");
//        System.out.println(bu);

        /*
        链式编程:方法返回值是一个对象,可以继续调用方法
         */
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase());
        bu.append("abc").append(1).append(true).append(8.8).append("中");
        System.out.println(bu);
    }

    ;
}
