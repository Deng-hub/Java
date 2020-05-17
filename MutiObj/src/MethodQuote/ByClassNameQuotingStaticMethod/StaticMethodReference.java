package MethodQuote.ByClassNameQuotingStaticMethod;

/*
通过类名引用静态成员方法
类已经存在，静态成员方法也已经存在
就可以通过类名直接引用静态成员方法
 */
public class StaticMethodReference {
//定义一个方法，方法的参数传递要计算的整数，何函数式接口Calculable
    public static int method(int number,Calculable c){
        return c.calsAbs(number);//
    }

    public static void main(String[] args) {
        //调用method方法，传递计算绝对值的整数，和Lambda表
         int number=method(-10,(n)->{
           //对参数进行绝对值的计算并返回结果
           return Math.abs(n);
       });
        System.out.println(number);//10
        /*
        使用方法引用优化Lambda表达式
        Math类是存在的
        abs计算绝对值得静态方法也是存在的
        所以我们可以直接通过类名和引用静态方法
         */
        int number2=method(-10,Math::abs);
        System.out.println(number2);//10
    }
}
