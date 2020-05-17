package Recursive;
/*
练习：
使用递归计算阶乘
n的阶乘：n!=n*(n-1)*...*1
5的阶乘：5*(5-1)*(5-2)*...*(5-4)
 */
public class Calculate_1ToN_Factorial {
    public static void main(String[] args) {

    }/*
        定义方法使用递归计算阶乘
        5的阶乘：5*(5-1)*(5-2)*...*(5-4)
        递归结束的条件：获取到1的时候结束
        递归的目的
        获取下一个被乘的数字（n-1）
         */
    public static int jc(int n){
        if(n==1){
            return 1;
        }
        return n*jc(n-1);
    }
}
