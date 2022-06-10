package Design_mode_设计模式.Simpleleton_单例模式;

/**
 * @author Sunpl
 * @description
 * @date 2022/6/9
 */
public class SimpleObject_EH {
    private static SimpleObject_EH instance;
    private SimpleObject_EH(){

    }
    //提供方法
    public static SimpleObject_EH getinstance(){
        if (instance ==null){
           instance=new SimpleObject_EH();
        }
        return instance;
    }

    public static synchronized   SimpleObject_EH getInstance(){
        if (instance==null){
            instance =new SimpleObject_EH();
        }
        return instance;

    }
}
