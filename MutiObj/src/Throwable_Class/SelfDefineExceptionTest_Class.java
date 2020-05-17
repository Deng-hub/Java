package Throwable_Class;

import java.util.Scanner;

/*
要求：我们模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已被注册。
分析：
1.使用数组保存已经注册过的用户名（数据库）
2.使用Scanner获取用户输入的注册的用户名(前端，页面）
3.定义一个方法，对用户输入的注册的用户名进行判断
遍历存储已经注册过用户名的数组，获取每一个用户名
使用获取到的用户名和用户输入的用户名比较
true:
用户名已经存在，找出SelfDefineException_Class异常，告知用户，该用户已经被注册；
false:
继续遍历比较
如果循环结束了，还没有找到重复的用户名。提示用户"恭喜你注册成功";
 */
public class SelfDefineExceptionTest_Class {
    static String[] usernames={"张三","李四","王五"};
    public static void main(String[] args) /*throws SelfDefineException_Class*/ {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要注册的用户名:");
        String username=sc.next();
        checkUsername(username);
    }
    public static void checkUsername(String username) /*throws SelfDefineException_Class*/ {
        //遍历存储已经注册过用户名的数组，获取每一个用户名
        for(String name:usernames){
            //使用获取到的用户名和用户输入的用户名比较
            if(name.equals(username)){
    //true:用户名已经存在，找出SelfDefineException异常，告知用户"亲,该用户已经被注册";
                try {
                    throw new SelfDefineException_Class("亲，该用户名已经被注册");
                } catch (SelfDefineException_Class selfDefineException_class) {
                    selfDefineException_class.printStackTrace();
                    return;//结束方法
                }
            }
        }
        //如果循环结束，还没有找到重复用户，提示用户"恭喜你注册成功"
        System.out.println("恭喜你，注册成功");
    }
}
