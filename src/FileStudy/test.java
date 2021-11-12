package FileStudy;

import com.sun.org.apache.bcel.internal.generic.I2F;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Sunpl
 * @description 测试类
 * @date 2021/9/23
 */
public class test {

    @Test
    public void math() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j <= i) {
                    System.out.print(j + "*" + i + "=" + i * j + " ");
                } else {
                    System.out.print(i + "*" + j + "=" + i * j + " ");
                }
            }
            System.out.println();
        }
    }


    @Test
    public void getMath() {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("排序前: " + Arrays.toString(arr));
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("排序后: " + Arrays.toString(arr));
    }


    //盲猜小游戏!!!
    public static void getCount() {
        System.out.println("欢迎━(*｀∀´*)ノ亻!");
        System.out.println("盲猜小游戏!!!");
        int qua = 50;
        Boolean falg = true;
        Random random = new Random();
        ArrayList list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = random.nextInt(100);
                }
            }
            list.add(arr[i]);
        }
        int y = arr.length;
        int misscout = 0;
        System.out.println("你总共有" + y + "次机会!!!");
        while (falg) {
            System.out.println("请输入0到" + qua + "其中的一个数字");
            try {
                int cout = 1;
                int x = Integer.parseInt(scanner.nextLine());
                if (list.contains(x)) {
                    System.out.println("恭喜你!!!猜中了!!!");

                } else {
                    y = y - cout;
                    cout++;
                    if (y > 0) {
                        if (y == 1) {
                            System.out.println("最后一次了,请把握机会哦!!!");
                        } else {
                            System.out.println("猜错咯!!!还剩下" + y + "次机会");
                        }
                    } else {
                        System.out.println("不好意思,游戏结束,下次再来吧!!!");
                        System.out.println("正确数字:" + list);
                        falg = false;
                    }
                }
            } catch (Exception e) {
                System.out.println("未输入数字,请重新输入!!!超过三次,游戏自动结束!!!");
                misscout++;
                if (misscout == 3) {
                    System.out.println("正确数字:" + list);
                    falg = false;
                }
            }
        }
    }

    public static void getOther() {
        int x = 11;
        int y = 10;
        for (int i = y; i >= 0; i--) {
            if (i == 0) {
                System.out.print(i);
            } else {
                System.out.println(i);
            }


        }
        for (int j = 1; j < x; j++) {
            if (j == 1) {
                System.out.print("  " + j + "  ");
            } else {
                System.out.print(j + "  ");
            }
        }

    }

    public static void main(String[] args) {
        Remove_Duplicates3();
//        Bubble();
//        Bubbloing();
//        dichotomy();
    }

    //选择排序 通过下标操作数组元素
    //从第一个数字开始依次比较,如果这个数是最小的,就放在第一的位置,然后开始用第二个数字开始比较如果不是最小的就换位
    public  static  void  choose(){
        Random random = new Random();
        int[] arr=new int[10];
        for (int i = 0; i < 10; i++) {
                arr[i]=random.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
             if (arr[i]<arr[j]){

             }
            }
        }

    }



    //随机生成0到100以内10个随机数,总共十个数组,找出出现次数最多的数
    public static  void  Remove_Duplicates3(){
        Random random = new Random();
        int[][] arr=new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
             arr[i][j]=random.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }


    }





    //去重2
    public static void Remove_Duplicates2() {
        Random random = new Random();
        int[] arr = new int[20];
        int[] arr2 = new int[20];
        int[] arr3 = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = random.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] < arr2[j]) {
                    arr[i]=arr2[j];
                    break;
                }
            }
            for (int k = 0; k < arr3.length; k++) {
                if (arr[i] < arr3[k]) {
                    arr[i]=arr3[k];
                    break;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

    }


    //排序
    public static void Sort() {
        Random random = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }


    }

    //二分法
    public static void dichotomy() {

        int middle = 0;
        int head = 0;
        int feet = 0;

        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        Random random = new Random();
        int[] arr = new int[13];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int counterfeit = scanner.nextInt();
        middle = arr[arr.length / 2];
        if (counterfeit < middle) {
            head = arr[0];
            feet = middle;
        } else {
            head = middle;
            feet = arr[arr.length];
        }


    }

    public static void middle() {

    }


    //三角游戏
    public static void Triangle() {

    }

    //冒泡  直接操纵元素本身
    public static void Bubble() {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int temp = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
    }

    //冒泡
    public static void Bubbloing() {
        int[] arr = new int[10];
        int temp = -1;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    //去重
    public static void Remove_Duplicates() {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {4, 5, 6, 7, 8};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    System.out.print(" " + arr2[i]);
                    arr1[j] = 0;
                }
            }
        }
    }


}
