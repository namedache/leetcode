package Queue;

/**
 * @Classname MyCircularQueue  循环队列的实现
 * @Description TODO
 * @Date 2019-11-14 10:05
 * @Author zhoukun
 */
public class CircularQueue {
    static class  MyCircularQueue {
        int head = 0;
        int tail = 0;
        int size = 0;
        final int[] array;

        // 构造器设置队列长度
        MyCircularQueue(int k) {
            size = k+1;
            array = new int[k+1];
            head = 0;
            tail = 0;
        }

        //从队首获取元素。如果队列为空，返回 -1
        public int Front() {
            return isEmpty() ? -1 : array[head];
        }

        //判断是否为空
        public boolean isEmpty() {
            return head==tail;
        }

        //判断是否已经满了
        public boolean isFull() {
            return (tail+1)%size==head;
        }

        //获取队尾元素。如果队列为空，返回 -1 。
        public int Rear() {
            return isEmpty() ? -1 : array[(tail-1+size)%size];
        }


        //加入一个新的元素
        public boolean enQueue(int value) {
            if((tail+1)%size==head){
                return false;
            }
            array[tail] = value;
            tail = (tail+1)%size;
            return true;
        }

        //删除元素
        public boolean deQueue() {
            if(tail==head){
                return false;
            }
            head = (head+1)%size;
            return true;
        }
    }

    public static void main(String[] args) {
       MyCircularQueue myCircularQueue = new MyCircularQueue(3);
       myCircularQueue.enQueue(1);
       myCircularQueue.enQueue(2);
       myCircularQueue.enQueue(3);
       myCircularQueue.enQueue(4);
       System.out.println(myCircularQueue.Rear());
       System.out.println(myCircularQueue.isFull());
       myCircularQueue.deQueue();
       myCircularQueue.enQueue(4);
       System.out.println(myCircularQueue.Rear());
    }




}
