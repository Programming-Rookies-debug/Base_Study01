package Proxy_静态代理;

/**
 * @author Sunpl
 * @description 静态代理
 * @date 2021/10/26
 */
public class TargetImpl implements  Target{
    @Override
    public String execute() {
        System.out.println("TargetImpl execute！");
        return "execute";
    }
}
