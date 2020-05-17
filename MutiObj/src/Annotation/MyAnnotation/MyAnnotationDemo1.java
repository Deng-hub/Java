package Annotation.MyAnnotation;

public @interface MyAnnotationDemo1 {
    int value();
    Person per();
    MyAnnotationDemo2 anno2();
    String[] strs();
//    String name() default "张三";//不赋值默认为张三

}
