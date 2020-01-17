package multithread.classCase;

/**
 * @Classname Test1
 * @Description TODO
 * @Date 2019-06-21 09:30
 * @Author zhoukun
 */
public class Test1 {

    public static void main(String[] args) {
        Person<String> perStr = new Person<String>();
        perStr.setT("我说");
        String str = perStr.getT();
        System.out.println(str);

        Person<Integer> perInt = new Person<Integer>();
        perInt.setT(100);
        Integer inter = perInt.getT();
        System.out.println(inter);
    }



}

class Person<T>{
    private T t;

    void setT(T t){
        this.t = t;
    }

    T getT(){
        return t;
    }
}
