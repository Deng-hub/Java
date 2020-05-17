package Annotation.MyAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@MyAnnotationDemo1(value=21,per=Person.p1,anno2 = @MyAnnotationDemo2,strs = "bbb")
@MyAnnotationDemo3
public class Worker {
    //@MyAnnotationDemo3
    public String name="aaa";
    //MyAnnotationDemo3
    public void show(){

    }
}
