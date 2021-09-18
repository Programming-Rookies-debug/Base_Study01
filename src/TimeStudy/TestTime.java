package TimeStudy;

import org.junit.Test;

import java.util.Calendar;

import static java.lang.Thread.sleep;

public class TestTime {
    public static void main(String[] args) {
        //日历类

        // 分钟数
        for (int i = 0; i < 10000; i++) {
            try {
                Calendar c=Calendar.getInstance();
                sleep(5000);
                System.out.println("现在是："+c.get(Calendar.HOUR) + "点" + c.get(Calendar.MINUTE) + "分"+ c.get(Calendar.SECOND) + "秒"+ c.get(Calendar.MILLISECOND) + "毫秒");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public  void  getsomeThings(){
        System.out.println("这是个测试的方法!");

    }


}
