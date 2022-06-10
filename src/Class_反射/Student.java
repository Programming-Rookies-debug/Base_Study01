package Class_反射;

/**
 * @author Sunpl
 * @description
 * @date 2022/6/7
 */
public class Student {
    public   String  name;
    private  String  age;
    //无参构造
    public Student(){

    }
    //有参构造
    public Student(String name,String age){
        this.name=name;
        this.age=age;
    }

    public  void  getInfo(){
        System.out.println("这是类中的公共方法!!");
    }

    private  void getInfo2(){
        System.out.println("这是类中的私用方法!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
