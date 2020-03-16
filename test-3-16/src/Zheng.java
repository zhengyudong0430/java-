import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.JarOutputStream;
//给定一个整型数组, 判定数组是否有序（递增）
public class Zheng {
   /* public static void bubbleSort(int []arr) {
        for(int i=0;i<arr.length-1;i++) {
            boolean flg = false;
            for(int j=0;j<arr.length-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                    int tmp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = tmp;
                    flg = true;
                }
            }
            if(flg=false) {
                return;
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {3,5,1,7,6,0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }*/

    public static boolean induge(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    return false;
                }

        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(induge(arr));

    }
}
    /*public static String toString(int[] arr) {
        String ret = "\"";
        ret += "[";
        for (int i = 0; i < arr.length; i++) {


            if (i < arr.length - 1) {
                ret += arr[i] + ",";

            } else if (i == arr.length - 1) {
                ret += arr[i] + "]";
            }
        }

        ret += "\"";
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String s = toString(arr);
        System.out.println();s
    }*/
