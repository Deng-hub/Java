package Annotation.MyAnnotation;

import java.lang.annotation.*;

/*
 *元注解：用于描述注解的注解
     *@Target:描述注解能够作用的位置
     *@Retention:描述注解被保留的阶段
     *@Documented:描述注解是否被抽取到api文档中
     *@Inherited:描述注解是否被子类继承
 */
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})//表示该MyAnnotationDemo3注解只能作用于类上,方法上，成员变量上
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyAnnotationDemo3 {

}
