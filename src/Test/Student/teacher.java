package Test.Student;

/**
 * @author Sunpl
 * @description 教师类
 * @date 2021/11/12
 */
public class teacher implements  person{
    private  person p;

    public teacher(person p) {
        this.p = p;
    }

    @Override
    public void run() {
        System.out.println("教师在run");
        p.run();
    }
}
