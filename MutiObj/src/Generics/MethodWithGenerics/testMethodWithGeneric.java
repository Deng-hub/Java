package Generics.MethodWithGenerics;

/**
 * 测试含有泛型的方法
 */
public class testMethodWithGeneric {
    public static void main(String[] args) {
        MethodWithGeneric mg = new MethodWithGeneric();
        mg.method01(10);
        mg.method01("abc");
        mg.method01(8.8);
        mg.method01(true);

        mg.method02("静态方法不建议创建对象使用 ");
        //静态方法,通过类名.方法名（参数）可以直接使用
        MethodWithGeneric.method02("静态方法");
        MethodWithGeneric.method02(1);
    }
}
