package ForLoop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoopStudy {
    public static void main(String[] args) {
        List list = getStrlist("21321,41231,23412,234324,q453q24");
        System.out.println(list);
    }

    //比较;俩分字段的差异性
    public static String getStr(String str, String prama) {
        //字符串有逗号隔开的
        getStrlist(str);


        return null;
    }

    public static List getStrlist(String str) {
        //用来存放切割好的字符串
        List list = new ArrayList();
        int tempParam = 0;
        String tempStr = "";
        for (int i = 0; i <=str.length(); i++) {
            if (str.substring(tempParam,i).contains(",")){
                tempParam=str.indexOf(",");
            }

        }
        return list;
    }
}






