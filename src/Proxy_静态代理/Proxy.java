package Proxy_静态代理;

/**
 * @author Sunpl
 * @description 代理类
 * @date 2021/10/26
 */
public class Proxy implements  Target{
    private  Target target;
    public Proxy(Target target) {
        this.target = target;
    }
    @Override
    public String execute() {
        System.out.println("perProcess");
        String result = this.target.execute();
        System.out.println("postProcess");
        return result;
    }

}
