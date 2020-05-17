package Generics.InterfaceWithGenerics;

/**
 * 含有泛型的接口，第一种使用方式：定义接口的实行类，实现接口,指定接口的泛型
 * public interface Iterator{
 * E.next();
 * }
 * Scanner类实现了Iterator接口，并指定接口的泛型为String，所以重写的next()方法泛型默认就是String
 * public final class Scanner implements Iterator<String>{
 * <p>
 * }
 */
public class InterfaceWithGeneric_Impl implements InterfaceWithGeneric<String> {
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
