public class sort {
    public static void insertsort (int []array) {
        for(int bound = 1;bound<array.length;bound++) {
            int tmp = array[bound];
            int cur = bound-1;
            for(;cur>=0;cur--) {
                if(array[cur]>tmp) {
                    array[cur+1] = array[cur];
                } else{
                    break;
                }
            }
            array[cur+1] = tmp;
        }
    }
    public static void Bubblesort(int []array) {
       int left = 0;
       int right = array.length-1;
       while(left<right) {
           for(int i = left;i<right;i++) {
               if(array[i]>array[i+1]) {
                   swap(array,i,i+1);
               }
           }
           right--;
           for(int i = right;i>left;i--) {
               if(array[i]<array[i-1]) {
                   swap(array,i,i-1);
               }
           }
           left++;
       }

    }
    public static void swap(int []array,int i,int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    public static void main(String[] args) {
       int []array = {4,1,3,6,9,7,5,0};
      // Bubblesort(array);
        insertsort(array);
        System.out.println(Arrays.toString(array));
    }
}
