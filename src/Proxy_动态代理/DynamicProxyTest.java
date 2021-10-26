package Proxy_动态代理;

import java.lang.reflect.Proxy;

/**
 * @author Sunpl
 * @description 动态代理测试类
 * @date 2021/10/26
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        Target target = new TargetImpl();
        DynamicProxyHandler handler = new DynamicProxyHandler(target);
        Target proxySubject = (Target) Proxy.newProxyInstance(TargetImpl.class.getClassLoader(),TargetImpl.class.getInterfaces(),handler);
        String result = proxySubject.execute();
        System.out.println(result);
    }

}
