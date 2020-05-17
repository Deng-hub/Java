package Stream.SkipMethod;

import java.util.stream.Stream;

/*
Stream流中的常用方法 skip：用于跳过元素
如果希望跳过前几个元素，可以使用skip方法获取一个截取周后的新流：
Strea<T> skip(Long n);
如果流的当前长度大于n,则跳过前n个；否则将会得到另一个擦汗高难度为0的空流
 */
public class Skip_Class {
    public static void main(String[] args) {
        //获取一个Stream流
        String[] arr={"美羊羊","喜羊羊","懒洋洋","灰太狼","红太狼"};
        Stream<String> stream= Stream.of(arr);
        //使用skit方法跳过前3个元素
        Stream<String> stream2=stream.skip(3);
        //遍历stream2流
        stream2.forEach(name-> System.out.println(name));
    }
}
