package Design_mode_设计模式.Singleton_Pattern;

/**
 * @author Sunpl
 * @description 单例模式
 * @date 2021/10/26
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }

    public  void   test(){
        System.out.println("这是个测试类");
    }
}
