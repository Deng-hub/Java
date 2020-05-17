package Junit.Annotation_Test_After_Before;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/*
@Befor：修饰的方法会在测试方法之前被执行
@Aftre:修饰的方法会在测试方法之后被执行
 */
public class CalculatorTest {

    /*
    初始化方法
    用于资源申请，所有测试方法在执行之前都会先执行该方法
     */
    @Before
    public void init(){
        System.out.println("init...");
    }
    /*
    释放资源方法，
    在所有测试方法执行完后，都会自动执行该方法
     */
    @After
    public void close(){
        System.out.println("close");
    }
   /*
    public static void main(String[] args) {
        //创建对象
        Calculator c=new Calculator();
        //调用


       int result=c.add(1,2);
       System.out.println(result);

       int result=c.sub(1,1);
        System.out.println(result);
    }
    */
@Test
    public void testAdd(){
    //System.out.println("我被执行了");
    //1.创建计算器对象
    System.out.println("testAdd...");
    Calculator c=new Calculator();
    //2.调用add方法
    int result=c.add(1,2);
//    int i=3/0;  //java.lang.ArithmeticException: / by zero
//    System.out.println(result);//3

    //3.断言，我断言这个结果是3
    Assert.assertEquals(3,result);//3是期望的结果 result是运行的结果
}
@Test
public void testSub(){
    Calculator c=new Calculator();
    int result=c.sub(1,2);
    System.out.println("testSub...");
    Assert.assertEquals(1,result);
}
}
/*
输出结果：
"C:\Program Files\JetBrains\IntelliJ IDEA 2019.3.4\jbr\bin\java.exe" -ea -Didea.test.cyclic.buffer.size=1048576 "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2019.3.4\lib\idea_rt.jar=59391:C:\Program Files\JetBrains\IntelliJ IDEA 2019.3.4\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\JetBrains\IntelliJ IDEA 2019.3.4\lib\idea_rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA 2019.3.4\plugins\junit\lib\junit5-rt.jar;C:\Program Files\JetBrains\IntelliJ IDEA 2019.3.4\plugins\junit\lib\junit-rt.jar;D:\JavaClass\MutiObj\out\production\JavaBaseMent;D:\JavaClass\MutiObj\lib\junit-4.12.jar;D:\JavaClass\MutiObj\lib\hamcrest-core-1.3.jar" com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit4 Junit.Annotation_Test_After_Before.CalculatorTest
init...
testAdd...
close
init...
testSub...
close

java.lang.AssertionError:
Expected :1
Actual   :-1
 */