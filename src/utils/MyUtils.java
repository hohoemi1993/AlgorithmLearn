package utils;

/**
 * Created on 2018/9/27<br>
 * @author dengxingda
 * @version 1.0
 */
public class MyUtils {

    /**
     * 生成 100大小的随机整数数组
     * @return 这个数组
     */
    public static int[] generateRandomArray(){
        int[] a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = (int) (Math.random() * 1000);
        }
        return a;
    }

    public static void showArray(int[] array){
        int j = 0;
        for( int i : array){
            System.out.print(i + " ");
            j++;
            if(j == 20){
                System.out.println("");
                j = 0;
            }
        }
    }
}
