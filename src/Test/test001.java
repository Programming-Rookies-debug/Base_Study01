package Test;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class test001 {
    final static String  str="public";
    final String  str2="prvicte";


    public static void main(String[] args) {
        String name="String";
        String name2="name";
       String  string= str +"  "+name+"  "+name2+";";
        System.out.println(string);

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
