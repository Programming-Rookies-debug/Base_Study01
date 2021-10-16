package ClazzStudy;

/**
 * @author Sunpl
 * @description 反射学习
 * @date 2021/10/11
 */
public class ClazzStudy {
    public static void main(String[] args) {
        Student student = new Student();
        Class stuClass=student.getClass();
        System.out.println(stuClass.getName());

        Class stuClass2=student.getClass();
        System.out.println(stuClass==stuClass2);

        try {
            Class  stuClass3=Class.forName("ClazzStudy.Student");
            System.out.println(stuClass2==stuClass3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
