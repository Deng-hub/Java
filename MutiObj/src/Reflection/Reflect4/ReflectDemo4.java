package Reflection.Reflect4;

import Reflection.Reflect1_Person.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
public class ReflectDemo4 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //0.获取Person的Class对象
        Class personClass= Person.class;
        /*
        3.获取成员方法们
        Method[] getMethods()
        Method getMethod(String name,类<T>..parameterTypes)

        Method[] getDeclaredMethods()
        Method getDeclaredMethods(String name,类<?>... parameterTypes)
         */
    //获取指定名称的方法
        Method eat_method=personClass.getMethod("eat");
        Person p=new Person();
        //执行方法
        eat_method.invoke(p);//eat...

        Method eat_method2=personClass.getMethod("eat",String.class);
        //执行方法
        eat_method2.invoke(p,"饭");//eat...饭
        System.out.println("-----------------");
        //获取所有public修饰的方法
        Method[] methods=personClass.getMethods();
        for(Method method:methods){
            System.out.println(method);
            String name=method.getName();
            System.out.println(name);
            //method.setAccessible(true);
        }
        //获取类名
        String className=personClass.getName();
        System.out.println(className);//Reflection.Reflect1_Person.Person
    }
}
