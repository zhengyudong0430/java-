//实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型)
//实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
//实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
//实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
//创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
import  java.util.Arrays;
public class Zheng {
    public static int[] init(int []arr) {
        for(int i=0;i<100;i++) {
            arr[i]=i+1;
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr = new int [100];
        init(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*public static void printArray(int []arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        printArray(arr);
    }*/
    /*
    public static int[] transform (int []arr) {
        for (int i=0;i<arr.length;i++) {
            arr[i]*=2;
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr={1,2,3};
        System.out.println("变化前:"+Arrays.toString(arr));
        transform(arr);
        System.out.println("变化后："+Arrays.toString(arr));
    }*/
    /*
    public static int sum(int []arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int []arr = new int []{1,2,3,4,5};
        System.out.println ("数组元素和为："+sum(arr));
    }*/
    /*
    public static int avg (int []arr) {
        int ret=0;
        for(int i=0;i<arr.length;i++) {
            ret+=arr[i];
        }
        return ret/arr.length;
    }
    public static void main(String[] args) {
        int []arr = new int []{1,2,3,4,5};
        System.out.println("平均数是："+avg(arr));

    }*/
}
