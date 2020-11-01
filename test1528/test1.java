package test1528;

/**
 * @author zhoukun
 */
public class test1 extends ClassLoader{

    public static void main(String[] args) {
        ClassLoader classLoader = test1.class.getClassLoader();
        System.out.println(classLoader);
        ClassLoader parent = classLoader.getParent().getParent();
        System.out.println(parent);
    }


    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}
