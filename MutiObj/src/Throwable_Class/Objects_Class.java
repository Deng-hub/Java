package Throwable_Class;

import java.util.Objects;

/*
Objects类中的静态方法
public static <T> T requiredNonNull(T obj);查看指定的引用对象不是null。
源码：
public static <T> T requireNonNull(T obj){
if(obj==null)
throw new Null PointerException();
return object;
}
 */
public class Objects_Class {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(Object obj){
//        if(obj==null){
//            throw new NullPointerException("传递的对象是null");//Exception in thread "main" java.lang.NullPointerException: 传递的对象是null
//        }
//       Objects.requireNonNull(obj);//Exception in thread "main" java.lang.NullPointerException
        Objects.requireNonNull(obj,"传递的对象是空");//Exception in thread "main" java.lang.NullPointerException: 传递的对象是空
    }
}
