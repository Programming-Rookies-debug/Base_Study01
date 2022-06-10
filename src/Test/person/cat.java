package Test.person;

/**
 * @author Sunpl
 * @description 代理类
 * @date 2021/11/12
 */
public class cat implements  person{
    @Override
    public void run() {
        System.out.println("猫在跑!!!");
        dog d=new dog();
        d.run();
    }
}
