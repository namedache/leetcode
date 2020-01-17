package multithread.List;

/**
 * @Classname Test1
 * @Description TODO
 * @Date 2019-06-21 10:06
 * @Author zhoukun
 */
public class Test1 {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("1");
        myStack.push("2");
        myStack.push("3");
        myStack.push("4");
        myStack.push("5");

        while (!myStack.isEmpty()){
            String pop = myStack.pop();
            System.out.println(pop);
        }


        MyQueue myQueue = new MyQueue();
        myQueue.put("1");
        myQueue.put("2");
        myQueue.put("3");
        myQueue.put("4");
        myQueue.put("5");

        while (!myQueue.isEmpty()){
            String string = myQueue.get();
            System.out.println(string);
        }


    }
}
