package FileStudy;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FileStudy {
    public static void main(String[] args) {
        //通过路径名创建一个新的File实例的对象
        File file = new File("D:\\ImageTest");
        //判断这个文件实例是不是一个文件,然后循环这个文件夹中的文件和文件夹,输出文件夹的名称
        String path = "C:\\Windows";
        getFileName(path);


    }

    public static void getFileName(String filepath) {
        File file = new File(filepath);
        try {
            if (file.isDirectory()) {
                for (File file1 : file.listFiles()) {
                    System.out.println(file1.getAbsolutePath());
                    getFileName(file1.getAbsolutePath());
                    System.out.println(getTime(file1.lastModified()));
                }
            } else {
                System.out.println(file.getName());
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("执行结束了!!!");
        }
    }


    public static String getTime(long timelong) {
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String day = format.format(timelong);
        return day;
    }


}

