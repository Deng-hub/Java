package FunctionalInterface.MyFunctinalInterface;
/*

 */
public class Parameter_Functional {
       public static void show(MyFunctionalInterface myInter){
           myInter.method();
       }

    public static void main(String[] args) {
       //调用show方法，方法的参数是一个接口,所以可以传递接口的实现类对象
        show(new MyFunctionalInterfaceImpl());
        //调用show方法，方法的参数是一个接口,所以可以传递接口的匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });
        //调用show方法，方法的参数是一个函数式接口所以我们可以Lambda表达式
        show(()->{
            System.out.println("使用Lambda重写接口中的抽象方法");
        });
        //简化Lambda表达式
        show(()->System.out.println("使用简化Lambda重写接口中的抽象方法")
        );
    }
}
