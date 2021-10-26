package other;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Sunpl
 * @description Momery
 * @date 2021/10/20
 */
public class Salary {
    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) {
            Date  date=new Date();
            DateFormat SimpleDateFormat=new SimpleDateFormat("yyyyMMddHHmmSS");
            System.out.println(SimpleDateFormat.format(date));
        }

        System.out.println(Math.ceil(123123.12312));
    }
}
