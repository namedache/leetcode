package multithread.learning;

/**
 * @Classname Thread2
 * @Description TODO
 * @Date 2019-02-28 15:28
 * @Author zhoukun
 */


class Test implements Runnable{
    private String name;

    public Test(String name) {
        this.name=name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行  :  " + i);
            try {
                Thread.sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}






public class Thread2 {

    public static void main(String[] args) {
        new Thread(new Test("线程1")).start();
        new Thread(new Test("线程2")).start();

    }

}
