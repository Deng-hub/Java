package Annotation.BaseAnnotation;

import Annotation.MyAnnotation.MyAnnotationDemo1;

import java.util.Date;

/*
*JDK中预定义的一些注解
@Override:检测被该注解标注的方法是否是继承自父类（接口）的
@Deprecated：将该注解标注的内容，已过时
@SuppressWarnings：压制警告
 */
@SuppressWarnings("all")
public class AnnotationDemo2 {
    @Override
    public String toString(){
        return super.toString();
    }
    @Deprecated
    public void show1(){
        //有缺陷
    }

    public void show2(){
        //替代show1方法
        show1();//有划线表示已过时不建议使用
        Date date=new Date();

    }
}
