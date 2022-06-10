package other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Sunpl
 * @description 系统主类
 * @date 2021/10/13
 */
public class Test {
    public static void main(String[] args) {
//    System.out.println();
//    String  str="00001212";
//        System.out.println(str.replaceFirst("^0*",""));
        List list =new ArrayList();
        HashMap map=new HashMap();
        HashMap map2=new HashMap();
        map.put("名称","小米手机");
        map.put("价格",5200);
        map.put("评价","好用");
        list.add(map);
        map.put("名称","小米手机");
        map.put("价格",5200);
        map.put("评价","好用");
        list.add(map);
        map2.put("手机",list);map2.put("平板",list);
        System.out.println(list);
        System.out.println(map2);
    }


}
