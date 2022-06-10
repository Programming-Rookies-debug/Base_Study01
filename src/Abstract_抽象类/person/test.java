package Abstract_抽象类.person;

/**
 * @author Sunpl
 * @description 测试类
 * @date 2021/11/12
 */
public class test {
    public static void main(String[] args) {
        Person   person=new Man();
        Women women=new Women(person);
        women.run();
    }
}
