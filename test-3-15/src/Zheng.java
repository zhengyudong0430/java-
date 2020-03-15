
import java.util.Arrays;
public class Zheng {
    public static void reverse(int []arr) {
        int left = 0;
        int right = arr.length-1;
        while(left<right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int []arr = {6,5,4,3,2,1};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*
        public static int binarysearch(int[]arr,int num) {
            int left=0;
            int right = arr.length-1;

            while(left<=right) {
                int mid = (left+right)/2;
                if(arr[mid]<num) {
                    left=mid+1;
                }
                else if(arr[mid]>num) {
                    right=mid-1;
                }
                else {
                    return mid;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            int []arr = {1,2,3,4,5,6};
            int ret= binarysearch(arr,4);
            System.out.println(ret);
        }*/
    }


