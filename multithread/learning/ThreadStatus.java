package multithread.learning;

/**
 * @Classname ThreadStatus
 * @Description object类wait和notif方法的使用
 * @Date 2019-03-05 10:26
 * @Author zhoukun
 */
public class ThreadStatus {


    private String flag[] = {"true"};

    public static void main(String[] args) {
        System.out.println("main thread start.....");
        ThreadStatus threadStatus =  new ThreadStatus();
        WaitThread waitThread = threadStatus.new WaitThread();
        NotifyThread notifyThread = threadStatus.new NotifyThread();
        waitThread.start();
        notifyThread.start();
        System.out.println(waitThread.getPriority());

    }

    class NotifyThread extends Thread{

        @Override
        public void run(){
            synchronized (flag){
                for (int i = 0; i < 5 ; i++) {
                    try {
                        sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("NotifyThread.run()----"+i);
                }

                flag[0]="false";
                flag.notify();
            }

        }

    }

    class WaitThread extends Thread{

        @Override
        public void run(){
            synchronized (flag){
                while (flag[0]!="false"){
                    System.out.println("WaitThread.run....");
                    try{
                        flag.wait();
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("wait() end....");

            }
        }

    }




}
