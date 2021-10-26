package Number_数组;

import java.util.Arrays;
import java.util.Random;

import static other.Hit.anyThings;

/**
 * @author Sunpl
 * @description StringApi常用方法
 * @date 2021/10/26
 */
public class StringNumber {
    public static void main(String[] args) {
        Random  random=new Random();
        String str="12-21";
        String StrArr=str.split("-")[0];
        String[] StrArr2=str.split("-");
        System.out.println(StrArr);
        System.out.println(Arrays.toString(StrArr2));
        anyThings();

        System.out.println(test01());
    }

    public static   String  test01(){
        try{
            int x=1/0;
        }catch (Exception e){
            return "1";
        }finally {
            return "2";
        }
    }


}
