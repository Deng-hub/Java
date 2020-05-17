package VariableParameter;

/*
可变参数：是JDK1.5之后出现的新特性
使用前提：
        当方法的参数列表类型已经确定，但是参数的个数不确定，就可以使用可变参数
        使用格式：定义方法时使用
            修饰符 返回值类型 方法名（数据类型...变量名）{}
          可变参数的原理是一个数组，根据传递的参数个数不同，会创建不同长度的数组，来存储这些参数
          传递的参数个数，可以是0个（不传递）,1,2...多个
 */
public class VariableParameter_Class {
    public static void main(String[] args) {
//        int i=add();
//        int i=add(10);
        int i = add(10, 20);
        System.out.println(i);
    }
    /*
    可变参数的注意事项
        1.一个方法的参数列表，只有一个可变参数
        2.如果方法的参数有多个那么可变参数必须卸载参数列表的末尾
     */
//    public static void method(int...a,String...b){
//
//    }//报错

//    public static void method(String b,double c,int d,int...a){
//
//    }//不报错

    //可变参数的特殊（终极）写法
//    public static void method(Object...obj) {
//    }

    /*定义计算(0-n)整数和的方法
    已知计算整数的和，数据类型已经确定int
    但是参数的个数不确定，不知要计算几个整数的和，我可以使用可变参数
    add()就会创建一个长度为0的数组，new int[0]
    add(10)就会创建一个长度为1的数组,new int[1]{10}
    add(10,20)就会创建一个长度为2的数组，new int[2]{10,20}
    */
    public static int add(int... arr) {
//        System.out.println(arr);// [I@5fd0d5ae 底层是一个数组
//        System.out.println(arr.length);//0
        int sum = 0;
        //遍历数组获取数组中的每一个元素
        for (int i : arr) {
            //累加求和
            sum += i;
        }
        return sum;
    }
//    public static int add(int a,int b,int c){
//        return  a+b+c;
//    }
//    public static int add(int a,int b){
//        return a+b;
//    }
}
