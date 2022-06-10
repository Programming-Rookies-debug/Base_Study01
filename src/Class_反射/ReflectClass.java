//package Class_反射;
//
//import com.sun.org.slf4j.internal.Logger;
//import com.sun.org.slf4j.internal.LoggerFactory;
//
//import java.lang.reflect.Constructor;
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//
///**
// * @author Sunpl
// * @description
// * @date 2022/6/7
// */
//public class ReflectClass {
//    private static final Logger log = LoggerFactory.getLogger(ReflectClass.class);
//
//
//    public static void main(String[] args) {
//         Class c= Student.class;
//        System.out.println(c);
//        Constructor<?> declaredConstructorBook= c.getDeclaredMethod(String.class,String.class);
//    }
//
//
//    public void reflectNewInstance() {
//        try {
//            Class<?> classBook = Class.forName("com.jourwon.reflect.Book");
//
//            Object objectBook = classBook.newInstance();
//            Book book = (Book) objectBook;
//            book.setName("Java高级特性-反射-创建对象");
//            book.setAuthor("JourWon");
//
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    // 反射私有的构造方法
//    public void reflectPrivateConstructor() {
//        try {
//            Class<?> classBook = Class.forName("com.jourwon.reflect.Book");
//            Constructor<?> declaredConstructorBook = classBook.getDeclaredConstructor(String.class, String.class);
//            // 暴力反射
//            declaredConstructorBook.setAccessible(true);
//            Object objectBook = declaredConstructorBook.newInstance("Java高级特性-反射-反射私有的构造方法", "JourWon");
//            Book book = (Book) objectBook;
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    // 反射私有属性
//    public void reflectPrivateField() {
//        try {
//            Class<?> classBook = Class.forName("com.jourwon.reflect.Book");
//            Object objectBook = classBook.newInstance();
//            Field fieldTag = classBook.getDeclaredField("TAG");
//            fieldTag.setAccessible(true);
//            String tag = (String) fieldTag.get(objectBook);
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//
//
//    // 反射私有方法
//    public void reflectPrivateMethod() {
//        try {
//            Class<?> classBook = Class.forName("com.jourwon.reflect.Book");
//            Method methodBook = classBook.getDeclaredMethod("declaredMethod", int.class);
//            methodBook.setAccessible(true);
//            Object objectBook = classBook.newInstance();
//            String string = (String) methodBook.invoke(objectBook, 0);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//
//
//
//}
