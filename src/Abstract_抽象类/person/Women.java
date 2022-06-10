package Abstract_抽象类.person;

/**
 * @author Sunpl
 * @description 实现类
 * @date 2021/11/12
 */
public class Women extends  Person{
    private   Person  person;

    public Women(Person person) {
        this.person = person;
    }

    @Override
    void run() {
        System.out.println("女在在跑");
        person.run();
    }
}
