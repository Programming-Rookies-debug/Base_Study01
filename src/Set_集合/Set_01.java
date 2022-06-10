package Set_集合;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Sunpl
 * @description
 * @date 2022/6/7
 */
public class Set_01 {
    public static void main(String[] args) {
        Set  set=new HashSet();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        set.add("5");
        System.out.println(set);
        Set treeSet =new TreeSet();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("4");
        treeSet.add("4");
        System.out.println(treeSet);
    }
}
