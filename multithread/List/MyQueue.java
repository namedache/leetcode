package multithread.List;

import java.util.LinkedList;

/**
 * @Classname MyQueue
 * @Description TODO
 * @Date 2019-06-21 10:09
 * @Author zhoukun
 */
public class MyQueue {


    private LinkedList<String> link = new LinkedList<String>();

    public void put(String str){
        link.addFirst(str);
    }

    public String get(){
        return link.removeLast();
    }

    public boolean isEmpty(){
        return link.isEmpty();
    }


}
