package list.sort;

import utils.MyUtils;

/**
 * Created on 2018/9/27
 * @author dengxingda
 * @version 1.0
 */
public class QuickSortRecusive {
    public static void main(String[] args) {
        int[] randomArray = MyUtils.generateRandomArray();
        MyUtils.showArray(randomArray);
        quickSort(randomArray);
        System.out.println("-------sorted-----------");
        MyUtils.showArray(randomArray);

    }

    public static void quickSort(int[] array){
        sort(array,0,array.length-1);
    }

    public static void sort(int[] array,int low,int high){
        // 递归的边界条件
        if(low >= high){
            return;
        }

        // 这一轮被比较的数,这里先拿出来
        // todo
        int key = array[low];
        // 定义两个哨兵,从数组两端开始巡逻
        int i = low;
        int j = high;

        // 两个哨兵相遇之前,即i < j
        while (i < j){
            // 哨兵j,一路向i,遇到比key小的就停下
            while (i < j && array[j] <= key ){
                j-- ;
            }
            if(i < j){
                array[i++] = array[j];
            }
            //哨兵i,一路向j,遇到比key大的就停下
            while (i < j && array[i] > key ){
                i++;
            }
            if(i < j){
                array[j--] = array [i];
            }
        }

        array[i] = key;

        sort(array,low,i);
        sort(array,i+1,high);
    }
}
