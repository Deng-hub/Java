package FunctionalInterface.FunctionInterface.andThen;

import java.util.function.Function;

/*
Function接口中的默认放法andThen:用来进行组合操作
需求：
把String类型的"123"转换为Integer类型，把转换后的结果加10
把增加之后的Integer类型的数据，转换为String类型
分析：
转换了两次
第一次是把String类型转换了Integer类型
所以我们可以使用Function<String,Integer> fun1
Integer i=fun1.apply("123");
第二次是吧Integer类型转换为String类型
所以我们可以使用Function<Integer,String> fun2
String s=fun2.apply();
我们可以使用andThen方法,把两次转换组合在一起使用
String s=fun1.andThen(fun2).apply("123");
fun1先调用apply方法，把字符串转换为Integer
fun2再调用apply方法，把Integer转换为字符串

 */
public class andThenMethod_Class {
    /*
    定义一个方法
    参数传递一个字符串类型整数
    参数再传递两个Function接口
    一个泛型使用Integer i=fun1.apply("123");
    一个泛型使用String s=fun2.apply();
     */
    public static void change(String s, Function<String,Integer> fun1,Function<Integer,String> fun2){
       String ss=fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }

    public static void main(String[] args) {
        //定义一个字符串类型的整数
        String s="123";
        //调用change方法，传递字符串和两个Lambda表达式
        change(s,(String str)->{
            //把字符串传递为整数+10
            return Integer.parseInt(str)+10;
        },(Integer i)->{
            //把整数转换为字符串
            return i+"";
        });
        //优化Lambda
        change(s,(str)-> Integer.parseInt(str)+10,(i)-> i+"");
    }
}
