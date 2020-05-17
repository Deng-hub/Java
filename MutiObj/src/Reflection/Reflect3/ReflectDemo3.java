package Reflection.Reflect3;

import Reflection.Reflect1_Person.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
Class对象功能：
*获取功能
1.获取成员变量们
    Field[] getFields():获取所有public修饰的成员变量
    Field getField(String name):获取指定public修饰的成员变量

    Field[] getDeclaredFields():获取所有的成员变量，不考虑修饰符
    Field getDeclaredField(String name);
2.获取构造方法们
    Constructor<?>[] getConstructors()
    Constructor<T> getConstructor(类<?>... parameterTypes)

    Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
    Constructor<?>[] getDeclaredConstructors()
3.获取成员方法们
    Method[] getMethods()
    Method getMethod(String name,类<T>..parameterTypes)

    Method[] getDeclaredMethods()
    Method getDeclaredMethods(String name,类<?>... parameterTypes)
4.获取类名
    String getName()
*/
public class ReflectDemo3 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //0.获取Person的Class对象
        Class personClass= Person.class;

  /*
    2.获取构造方法们
    Constructor<?>[] getConstructors()
    Constructor<T> getConstructor(类<?>... parameterTypes)

    Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
    Constructor<?>[] getDeclaredConstructors()
 */
    //    Constructor<T> getConstructor(类<?>... parameterTypes)
        Constructor constructor=personClass.getConstructor(String.class,int.class);
        System.out.println(constructor);
        //创建对象
        Object person=constructor.newInstance("张三",23);
        System.out.println(person);//Person{name='张三', age=23, a='null', b='null', c='null', d='null'}

        System.out.println("---------------------");
        Constructor constructor1=personClass.getConstructor();
        System.out.println(constructor1);
        //创建对象
        Object person1=constructor1.newInstance();
        System.out.println(person1);//Person{name='null', age=0, a='null', b='null', c='null', d='null'}
        //简化空参数的方法
        Object o=personClass.newInstance();
        System.out.println(o);//Person{name='null', age=0, a='null', b='null', c='null', d='null'}
            //constructor1.setAccessible(true);
    }
}
