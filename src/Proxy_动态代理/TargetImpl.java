package Proxy_动态代理;

/**
 * @author Sunpl
 * @description 动态代理
 * @date 2021/10/26
 */
public class TargetImpl implements  Target{
    @Override
    public String execute() {
        System.out.println("TargetImpl execute！");
        return "execute";
    }

    @Override
    public String update() {
        System.out.println("这是个update方法!!!");
        return "update";
    }
}
