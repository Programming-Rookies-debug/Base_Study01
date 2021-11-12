package Proxy_动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Sunpl
 * @description 动态代理类
 * JDK底层的动态代理方式
 * 继承InvocationHander方法,重写invoke方法
 * @date 2021/10/26
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Target target;

    public DynamicProxyHandler(Target target) {
        this.target = target;
    }

    //增加逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("========before==========");
        Object result = method.invoke(target, args);
        if (method.getName() == "execute") {
            System.out.println("这是execute方法的调用!!!");
        }
        if (method.getName() == "update") {
            System.out.println("这是update方法的调用!!!");
        }
        System.out.println("========after===========");
        return result;
    }

}
