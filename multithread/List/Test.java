package multithread.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2019-06-21 09:51
 * @Author zhoukun
 */
public class Test {
    //使用ArrayList进行添加和遍历
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");

        //第一种方式遍历
        for (int i = 0; i <strings.size() ; i++) {
            System.out.println(strings.get(i));
        }

        //第二种方式遍历（迭代器）
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        //第二种方式遍历（foreach）
        for (String str: strings) {
            System.out.println(str);
        }
    }



}
