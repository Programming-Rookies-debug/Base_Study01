package other;

/**
 * @author Sunpl
 * @description 抽象类
 * @date 2021/10/26
 */
public  abstract class Hit {
    private  String name="zhangsan";
    public   String  age="18";
    private   static   final   String   emil="111111";

    public abstract   void  HitDog();

    public   static   void  anyThings(){
        System.out.println("这是抽象类中的抽象方法!!!");
    }

    public  void  get(){

    }
}
