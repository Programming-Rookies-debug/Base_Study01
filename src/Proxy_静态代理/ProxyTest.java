package Proxy_静态代理;

/**
 * @author Sunpl
 * @description 测试类
 * @date 2021/10/26
 */
public class ProxyTest {
    public static void main(String[] args) {

        Target target = new TargetImpl();
        Proxy p = new Proxy(target);
        String result = p.execute();
        System.out.println(result);
    }
}
