package FunctionalProgramming.EasyLambda;

import java.util.ArrayList;

/*
有且只有一个抽象方法的接口称为函数接口
Lambda表达式：是可推倒，可省略
凡是根据上下文推到出来的内容，都可以省略书写
可以省略的内容：
1.（参数列表）:括号中参数列表的数据类型，可以省略不写
2.（参数列表):括号中的参数如果只有一个，那么类型和()都可以省略
3.(一些代码):如果{}中代码只有一行，无论是否有返回值，都可以省略({},return,分号)
 注意：要省略{},return,分号必须一起省略
 */
public class EasyLambda {
    public static void main(String[] args) {
        //JDK1.7版本之前，创建集合对象必须把前后的泛型都写上
        ArrayList<String> list01=new ArrayList<String>();
        //JDK1.7版本之后，=号后边的泛型可以省略，后边的泛型可以根据前边的泛型推到出来
        ArrayList<String> list02=new ArrayList<>();

    }
}
