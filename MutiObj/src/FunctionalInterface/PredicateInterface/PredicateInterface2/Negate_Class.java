package FunctionalInterface.PredicateInterface.PredicateInterface2;

import java.util.function.Predicate;

/*
需求：判断一个字符串长度是否大于5
1.判断字符串的长度大于5,那返回false
2.判断字符串的长度小于5,true
所以我们可以使用取反符号!对判断结果进行取反

Predicate接口中有一个方法negate，也表示取反的意思
default Predicate<T> negate(){
return (t)->!test(t);
}
 */
public class Negate_Class {
    /*
  定义一个方法，方法的参数，传递一个字符串
  使用Predicate接口判断字符串的长度是否大于5
   */
    public static boolean checkString(String s, Predicate<String> pre1){
//        return !pre1.test(s);
        return pre1.negate().test(s);
    }

    public static void main(String[] args) {
        //定义一个字符串
        String s="apk";
        //调用checkString方法，参数传递字符出和Lambda表达式
       boolean b=checkString(s,(String str)->{
           //判断字符串的长度是否大于5，并返回结果
           return str.length()>5;
       });
        System.out.println(b);
    }
}
