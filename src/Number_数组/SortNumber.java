package Number_数组;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Sunpl
 * @description 快速排序
 * @date 2021/10/26
 */
public class SortNumber {
    public static void main(String[] args) {
        //获取随机数数组
        int[] array = getArr(100,1000);
        System.out.println("原数组: " + Arrays.toString(array));

        System.out.println("选择排序");
        choooseSortArr(array);
        System.out.println("排序后: " + Arrays.toString(array));

        System.out.println("快速排序");
        quickSort(array);
        System.out.println("排序后: " + Arrays.toString(array));

        System.out.println("插入排序");
        insertionSort(array);
        System.out.println("排序后: " + Arrays.toString(array));

        System.out.println("归并排序");
        mergeSort(array);
        System.out.println("排序后: " + Arrays.toString(array));

        System.out.println("希尔排序");
        shellSort(array);
        System.out.println("排序后: " + Arrays.toString(array));
    }
    //希尔排序
    public static void shellSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;
        // temp为临时变量，gap增量默认是长度的一半，每次变为之前的一半，直到最终数组有序
        int temp, gap = length / 2;

        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                // 将当前的数与减去增量之后位置的数进行比较，如果大于当前数，将它后移
                temp = array[i];
                int preIndex = i - gap;

                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                // 将当前数放到空出来的位置
                array[preIndex + gap] = temp;

            }
            gap /= 2;
        }
    }


    //归并排序
    public static void mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = left + ((right - left) >> 1);
        // 对左侧子序列进行递归排序
        sort(array, left, mid);
        // 对右侧子序列进行递归排序
        sort(array, mid + 1, right);
        // 合并
        merge(array, left, mid, right);
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = 0;
        int p1 = left;
        int p2 = mid + 1;
        // 比较左右两部分的元素，哪个小，把那个元素填入temp中
        while (p1 <= mid && p2 <= right) {
            temp[i++] = array[p1] < array[p2] ? array[p1++] : array[p2++];
        }
        // 上面的循环退出后，把剩余的元素依次填入到temp中
        // 以下两个while只有一个会执行
        while (p1 <= mid) {
            temp[i++] = array[p1++];
        }
        while (p2 <= right) {
            temp[i++] = array[p2++];
        }
        // 把最终的排序的结果复制给原数组
        for (i = 0; i < temp.length; i++) {
            array[left + i] = temp[i];
        }
    }


    //插入排序
    public static void insertionSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;
        // 要插入的数
        int insertNum;
        for (int i = 1; i < length; i++) {
            insertNum = array[i];
            // 已经排序好的元素个数
            int j = i - 1;
            while (j >= 0 && array[j] > insertNum) {
                // 从后到前循环，将大于insertNum的数向后移动一格
                array[j + 1] = array[j];
                j--;
            }
            // 将需要插入的数放在要插入的位置
            array[j + 1] = insertNum;
        }
    }


    //快速排序
    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int left, int right) {
        if (array == null || left >= right || array.length <= 1) {
            return;
        }
        int mid = partition(array, left, right);
        quickSort(array, left, mid);
        quickSort(array, mid + 1, right);

    }

    private static int partition(int[] array, int left, int right) {
        int temp = array[left];
        while (right > left) {
            // 先判断基准数和后面的数依次比较
            while (temp <= array[right] && left < right) {
                --right;
            }
            // 当基准数大于了 arr[left]，则填坑
            if (left < right) {
                array[left] = array[right];
                ++left;
            }
            // 现在是 arr[right] 需要填坑了
            while (temp >= array[left] && left < right) {
                ++left;
            }
            if (left < right) {
                array[right] = array[left];
                --right;
            }
        }
        array[left] = temp;
        return left;
    }

    //选择排序
    public static void  choooseSortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            //保存最小元素的下标
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                swap(arr, minIndex, i);
            }
        }

    }

    public static int[] swap(int[] arr, int minIndex, int i) {
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
        return arr;
    }

    //获取随机数数组
    public static int[] getArr(int length,int bound) {
        Random random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(bound);
        }
        return arr;
    }
}
