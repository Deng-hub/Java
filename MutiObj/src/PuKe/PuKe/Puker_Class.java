package PuKe.PuKe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
斗地主综合案例:有序版本
1:准备牌
2：洗牌
3：发牌
4:排序
5:看牌
 */
public class Puker_Class {
    public static void main(String[] args) {

           //创建一副新牌
            HashMap<Integer, String> map = new HashMap<Integer, String>();
            //添加牌的索引
            ArrayList<Integer> me = new ArrayList<>();
            //发好的牌
            ArrayList<Integer> mom = new ArrayList<>();
            ArrayList<Integer> papa = new ArrayList<>();
            ArrayList<Integer> dipai = new ArrayList<>();
            ArrayList<Integer> num = new ArrayList<Integer>();

            String[] A = {"黑桃", "红桃", "方块", "梅花"};
            String[] B = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
            int index = 0;
            map.put(index, "大王");
            num.add(index);
            index++;
            map.put(index, "小王");
            num.add(index);
            index++;
            for (String ch : B) {
                for (String nu : A) {
                    map.put(index, nu + ch);
                    num.add(index);
                    index++;
                }
            }
            //打乱索引顺序
            Collections.shuffle(num);

            for (int i = 0; i < num.size(); i++) {
                int w = num.get(i);
                if (i < 51) {
                    if (i % 3 == 0) {
                        me.add(w);
                    }
                    if (i % 3 == 1) {
                        mom.add(w);
                    }
                    if (i % 3 == 2) {
                        papa.add(w);
                    }
                } else {
                    dipai.add(w);
                }
            }
            Collections.sort(me);
            Collections.sort(mom);
            Collections.sort(papa);
            Collections.sort(dipai);
            Meth("me", map, me);
            Meth("mom", map, mom);
            Meth("papa", map, papa);
            Meth("底牌", map, dipai);
        }
        public static void Meth (String name, HashMap < Integer, String > map, ArrayList < Integer > list){

            System.out.println(name + " :");
            System.out.println(list);
            for (Integer c : list) {
                String v = map.get(c);
                System.out.print(v + "  ");
            }
            System.out.println();
        }
    }
