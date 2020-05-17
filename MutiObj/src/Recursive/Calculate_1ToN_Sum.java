package Recursive;
/*
练习：
使用递归计算1-n之间的和
 */
public class Calculate_1ToN_Sum {
    public static void main(String[] args) {
    int s=sum(100);//5050
        System.out.println(s);
    }
    /*
    定义一个方法，使用递归计算，1-n之间的和
    1+2+3+4+5+....n
    n+(n-1)+(n-2)+...1
    已知：
    最大值:n
    最小值：1
    使用递归的必须明确：
    1.递归的结束条件
    获取到1的时候结束
    2.递归的目的
    获取下一个被加的数字（n-1)
     */
    public static int sum(int n){
        //获取到1的时候结束
        if(n==1){
            return 1;
        }
        //获取下一个被加的数字(n-1)
        return n+sum(n-1);
    }
}
