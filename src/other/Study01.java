package other;

/**
 * @author Sunpl
 * @description java基础学习
 * @date 2021/10/26
 */
public class Study01 {
   private static final  String  name="zhangsan";

    public static void main(String[] args) {

       test002();
    }

    public  void  getsometThing(){
        System.out.println("这是什么!!!");
        test002();
    }
    public  static   void test002(){
        System.out.println("这是个静态的方法!!!");
    }
}
