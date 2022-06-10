package Map_集合;

import java.util.*;

/**
 * @author Sunpl
 * @description map学习
 * @date 2021/10/27
 */
public class Map_Demo {

    public static void main(String[] args) {
        Map map = new HashMap();
        String[]  strArr={"Age","Name","Code","email","phone"};
        Random random = new Random();
        List list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < strArr.length; j++) {
                map.put(strArr[i], random.nextInt(100));
            }
            list.add(map);
        }
        System.out.println(list);
    }

}
