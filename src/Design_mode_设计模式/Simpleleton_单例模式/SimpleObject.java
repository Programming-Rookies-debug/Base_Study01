package Design_mode_设计模式.Simpleleton_单例模式;

/**
 * @author Sunpl
 * @description 简单的单例模式学习
 * @date 2022/6/9
 */
public class SimpleObject {
    //利用反射生成单一的实例
    private static   SimpleObject instance =new SimpleObject();
    //私有化无参构造
    private SimpleObject(){

    }
    //提供方法让外界获取实例
    public static   SimpleObject getInstance(){
        return instance;
    }
    //写一个方法让实例调用
    public  void  testInstance(){
        System.out.println("调用实例中的方法");
    }

}
