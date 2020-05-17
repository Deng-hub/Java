package Generics.InterfaceWithGenerics;

/**
 * 测试含有泛型的接口
 */
public class testInterfaceWithGeneric {
    public static void main(String[] args) {
        //创建实现类1对象 InterfaceWithGeneric_Impl
        InterfaceWithGeneric_Impl impl = new InterfaceWithGeneric_Impl();
        impl.method("字符串");

        //创建实现类2对象 InterfaceWithGeneric_Impl2
        InterfaceWithGeneric_Impl2 impl2 = new InterfaceWithGeneric_Impl2();
        impl2.method(8.8);
    }
}
