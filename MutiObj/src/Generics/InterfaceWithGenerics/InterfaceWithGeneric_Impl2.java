package Generics.InterfaceWithGenerics;

/**
 * 含有泛型接口的第二种使用方式,接口使用什么泛型，实现类就使用什么泛型，类跟着接口走
 * 相当于定义了一个含有泛型的类，创建对象的时候确定泛型的类型
 * public interface List<E>{
 * boolean add(E e);
 * E get(int index);
 * }
 * public class ArrayList<E> implements List<E>{
 * public boolean add(E e){}
 * public E get(int index){}
 * }
 */
public class InterfaceWithGeneric_Impl2<I> implements InterfaceWithGeneric<I> {
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
