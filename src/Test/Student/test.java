package Test.Student;

/**
 * @author Sunpl
 * @description 测试类
 * @date 2021/11/12
 */
public class test {
    public static void main(String[] args) {
        person person=new student();
        teacher  teacher=new teacher(person);
        teacher.run();
    }
}
