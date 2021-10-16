package ClazzStudy;

/**
 * @author Sunpl
 * @description 实体类
 * @date 2021/10/12
 */
public class Student {

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                '}';
    }

    public Student(String name, int age, int sex, String email) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }

    public  String  name;
    private  int age;
    public  int  sex;
    public  String  email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
