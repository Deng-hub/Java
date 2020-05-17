package Stream.FilterMethod;

import java.util.stream.Stream;

/*
Stream流中的常用方法 filter:用于对Stream流中的数据进行过滤
Stream<T> filter(Predicate<? super T> predicate);
filter方法的参数Predicate是一个函数式接口，所以可以传递Lambda表达式，对数据进行过滤
 Predicate中的抽象方法:
 boolean test(T t);
 */
public class FilterMethod_Class {
    public static void main(String[] args) {
        //创建一个Stream流
        Stream<String> stream=Stream.of("张三丰","张翠山","赵敏","周芷若","张无忌");
        //对Stream的的元素进行过滤，只要姓张的人
        Stream<String> stream2=stream.filter((String name)->{return name.startsWith("张");});
        //遍历Stream2流
        stream2.forEach(name-> System.out.println(name));//张三丰 张翠山 张无忌

          /*Stream流属于管道流，只能被消费（使用）一次
        第一个Stream流调用完毕方法，数据就会流转到下一个Stream上
        而这时第一个Stream流已经使用完毕，就会关闭了
         */
          //遍历stream流
        stream.forEach(name-> System.out.println(name));//java.lang.IllegalStateException
    }
}
