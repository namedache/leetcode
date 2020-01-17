package multithread.classCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2019-06-21 09:25
 * @Author zhoukun
 */
public class Test {


//    public static void main(String[] args) {
//        List list = new ArrayList<>();
//        list.add(1);
//        list.add("123");
//        list.add("helo");
//
//
//        Iterator it = list.iterator();
//        while (it.hasNext()){
//            Object object = it.next();
//            System.out.println(object);
//        }
//
//    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("123");
        list.add("helo");


        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String string = it.next();
            System.out.println(string.length());
        }

    }

}
