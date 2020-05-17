package Collection.Set.HashSet.HashCode;

/**
 * 哈希值:是一个十进制的整数，由系统随机给出（就是对象的地址值，是一个逻辑地址，是模拟出来得到地址，不是数据实际的物理地址）
 * 再Object类中有一个方法，可以获取对象的哈希值
 * int hashCode() 返回该对象的哈希值.
 * hashCode方法的源码：
 * public native int hashCode();
 * native：代表该方法调用的是本地操作系统的方法
 * 哈希表：
 * jdk1.8版本之前哈希表=数组+链表（数组结构(数组长度16个) 把元素进行了分组，（相同哈希的元素是一组） 链表/红黑树结构把相同哈希元素链接在一起
 * int 【】a=new int[16];  a[0]放的就是一样hash值的元素  a[1]放的又是另一个hash值一样的所有元素 类似于数组元素中放了链表或者红黑树,其元素是相连的
 * jdk1.8之后哈希表=数组+红黑树（提高查询速度）【如果链表的长度超过了8位那么就会把链表转换为红黑树（查询速度快）】
 * 哈希表的特点：速度快
 * 两个元素不同hash值相同叫hash冲突：重地-通话
 * -----------------------------------------------------
 */
public class Hash_Class {


    public static void main(String[] args) {
        //Person类继承了Object类，所以可以使用Object类的hashCode方法
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);//764977973

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);//381259350
        /*
          return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode())
         */

        System.out.println(p1);//Collection.Set.HashSet.LinkedHashSet.Person@2d98a335
        System.out.println(p2);//Collection.Set.HashSet.LinkedHashSet.Person@16b98e56

        System.out.println(p1 == p2);
        /*
        String类的哈希值
        String类重写Object类的hashCode方法
         */

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354

        System.out.println("重地".hashCode());// 1179395
        System.out.println("通话".hashCode());//1179395
    }
}
