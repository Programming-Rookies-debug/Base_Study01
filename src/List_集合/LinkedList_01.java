package List_集合;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @author Sunpl
 * @description
 * @date 2022/6/7
 */
public class LinkedList_01 {
    public static void main(String[] args) {

        List list=new LinkedList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("4");

        System.out.println(list);

        List  v  =new Vector();
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");
        v.add("4");
        System.out.println(v);
    }
}
