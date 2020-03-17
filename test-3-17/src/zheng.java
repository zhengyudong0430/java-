import java.util.Arrays;

//数组逆置
//奇数偶数
public class zheng {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.printf("%d\t", arr[row][col]);
            }
            System.out.println();
    }
    /* public static void transform(int[]arr) {
        int left=0;
        int right=arr.length-1;
        while(left<right) {
            while((left<right)&&arr[left]%2==1) {
                left++;
            }
            while ((left<right)&&arr[right]%2==0) {
                right--;
            }
            int tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
        }
    }
    public static void main(String[] args) {
        int[]arr = new int []{3,5,2,1,6,8,7};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }*/
    /*public static void reverse(int[]arr) {
        int left = 0;
        int right = arr.length-1;
        while(left<right) {
            int tmp=arr[left];
             arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[]arr = {8,7,6,5,4,3,2,1,0};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }*/
}
}
