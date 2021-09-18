package Test;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class test001 {
    public static void main(String[] args) {
        System.out.println(getInt());

    }

    public  static int  getInt(){
        try {
            System.out.println(1/0);
        }catch (Exception e){
            System.out.println(e);
            return 1;
        }finally {
            return  2;
        }
    }













    @Test
    public void get(){
        switch (2){
            case 1 : case 2: case 5: case 6:
                try{
                    System.out.println(1/0);
                }catch (Exception e){
                    System.out.println(e);
                    break;

                }finally {
                    System.out.println("结束了!!");
                }
                System.out.println("1 and 2");
                break;
            case 3 : case 4:
                System.out.println("3 and 4");
                break;
        }
    }











    /**
     * 将字符串的月份开始天数和结束天数解析成日期格式
     *
     * @param format
     * @return
     */
    public static List<Date> parseGetMonth(String format) {
        List<Date> dateList = new ArrayList<>();
        String[] split = format.split("-");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        try {
            Date startDate = sdf.parse(split[0]);
            Date endDate = sdf.parse(split[1]);
            dateList.add(startDate);
            dateList.add(endDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateList;
    }
}
