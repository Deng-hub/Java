package Generics;

import Generics.ClassOfGenerics.ClassWithGenerics;

public class testClassWithGeneric {
    public static void main(String[] args) {
        //不写泛型默认为object类型
        ClassWithGenerics gc = new ClassWithGenerics();
        gc.setName("只能是字符串");
        Object obj = gc.getName();

        //创建ClassWithGenerics对象，泛型使用Integer类型
        ClassWithGenerics<Integer> gc2 = new ClassWithGenerics<>();
        gc2.setName(1);

        Integer name = gc2.getName();
        System.out.println(name);

        ClassWithGenerics<String> gc3 = new ClassWithGenerics<>();
        gc3.setName("小明");
        String name2 = gc3.getName();
        System.out.println(name2);
    }

}
