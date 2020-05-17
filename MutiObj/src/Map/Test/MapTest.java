package Map.Test;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Scanner;

/*
练习：计算一个字符串中每个字符的出现次数.
1.获取一个字符串对象
2.创建一个Map集合，键代表字符，值代表次数
3.遍历字符串得到每个字符
4.判断Map中是否有该键
5.如果没有，第一次出现，存储次数为1;如果有，则说明已经出现过，获取到对应值进行++，再次存储
6.打印最终结果
步骤：
1.使用Scanner获取用户输入字符串
2.创建Map集合，key是字符串中的字符，value是字符的个数
3.遍历字符串，获取每一个字符
4.使用获取到的字符，去Map集合判断key是否存在
key存在：
通过字符（key),获取value(字符个数)
value++
put(key,value)把新的value存储到Map集合中
key不存在：
put(key,1)
5.遍历集合，输出结果
 */
public class MapTest {
    public static void main(String[] args) {
        //1.使用Scanner获取用户输入字符串
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        //2.创建Map集合，key是字符串中的字符，value是字符的个数
        HashMap<Character,Integer> map=new HashMap<>();
        //3.遍历字符串，获取每一个字符
        for(char c:str.toCharArray()){
            //4.使用获取到的字符，去Map集合判断key是否存在
            if(map.containsKey(c)){
                Integer value=map.get(c);
                value++;
                map.put(c,value);
            }
            else {
                //key不存在
                map.put(c, 1);
            }
        }
        //遍历集合，输出结果
        for(Character key:map.keySet()){
            Integer value=map.get(key);
            System.out.println(key+"-->"+value);
        }
    }

}
