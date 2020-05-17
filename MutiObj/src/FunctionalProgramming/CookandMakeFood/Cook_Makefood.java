package FunctionalProgramming.CookandMakeFood;
/*
需求：
给定一个厨子Cook接口，内含唯一的抽象方法makeFood，且无参数，无返回值
使用Lambda的标准格式调用invokeCook方法，打印输出“吃饭啦！“字体
 */
public class Cook_Makefood {
    public static void main(String[] args) {
    //调用invokeCook方法，参数时Cook接口，传递Cook接口的匿名内部类对象
//    invokeCook(new Cook() {
//        @Override
//        public void makeFood() {
//            System.out.println("吃饭了");
//        }
//    });

    invokeCook(() ->
        {
            System.out.println("吃饭了");
        }
    );
    //使用Lambda表达式简化

    }
    //定义一个方法，参数传递Cook接口，方法内部调用Cool接口中的方法makeFood
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
