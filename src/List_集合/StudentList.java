package List_集合;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Sunpl
 * @description 集合
 * @date 2022/2/11
 */
public class StudentList {
    public static void main(String[] args) {
        //存放5个元素
        String[]  str=new String[5];
        //list集合
        List<String> list=new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        //迭代器循环遍历list集合
        Iterator iterable=list.iterator();
        while (iterable.hasNext()){
            System.out.println(iterable.next());
        }
        //subList方法
        System.out.println(list.subList(1,list.size()));
            List<String> arrayList = new ArrayList<String>();
            arrayList.add("a");
            arrayList.add("b");
            arrayList.add("b");
            arrayList.add("c");
            arrayList.add("d");
            arrayList.add("e");
//             remove(arrayList);
//             remove2(arrayList);
            remove3(arrayList);
            System.out.println(arrayList);
        Collections.sort(list);



    }

    /**
     * Description: for循环遍历
     * 输出结果：
     * [a, b, c, d, e]
     * 由结果可知，第二个元素b并未删除，原因是当第一个元素b被删除后，它后面所有的元素都向前移动了一个单位，循环时导致第二个元素b漏掉了
     */
    public static void remove(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.equals("b")) {
                list.remove(s);
            }
        }
    }

    /**
     * Description: foreach循环遍历
     *
     * 会报错：java.util.ConcurrentModificationException。这是因为在这里，foreach循环遍历容器本质上是使用迭代器进行遍历的，会对修改次数modCount进行检查，不允许集合进行更改操作
     */
    public static void remove2(List<String> list) {
        for (String s : list) {
            if (s.equals("b")) {
                list.remove(s);
            }
            System.out.println(s);
        }
    }

    /**
     * Description: 使用迭代器遍历
     */
    public static void remove3(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.equals("b")) {
                it.remove();
            }
        }
    }

}
