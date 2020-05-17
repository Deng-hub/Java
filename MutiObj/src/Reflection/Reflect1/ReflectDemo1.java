package Reflection.Reflect1;

import Reflection.Reflect1_Person.Person;

public class ReflectDemo1 {
    /*
    1.Class.forName("全类名"):将字节码文件加载进内存，返回Class对象
    2.类名.class:通过类名的属性class获取
    3.对象.getClass():getClass()方法在object类中定义着.
    */
    public static void main(String[] args) throws ClassNotFoundException {
    //1.Class.forName("全类名")
        Class cls1=Class.forName("Reflection.Reflect1_Person.Person");//全限定类名
        System.out.println(cls1);
     //2.类名.class:通过类名的属性class获取
        Class cls2=Person.class;
        System.out.println(cls2);
      //3.对象.getClass():getClass()方法在object类中定义着.
        Person p=new Person();
        Class cls3=p.getClass();
        System.out.println(cls3);
        //用==比较三个对象
        System.out.println(cls1==cls2);//true
        System.out.println(cls1==cls3);//true
    }
}
