package multithread.List;

import java.util.LinkedList;

/**
 * @Classname MyStack
 * @Description TODO
 * @Date 2019-06-21 09:58
 * @Author zhoukun
 */
public class MyStack {
    private LinkedList<String> linkedList = new LinkedList<String>();


    //压栈方法
    public void push(String str){
        linkedList.addFirst(str);
    }

    //出栈
    public String pop() {
        return linkedList.removeFirst();
    }

    //查看
    public String peek(){
        return linkedList.peek();
    }

    //判断是否为空
    public boolean isEmpty(){
        return linkedList.isEmpty();
    }

}







