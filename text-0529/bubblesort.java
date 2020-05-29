public class sort {
    public static void sort(int []array) {
        boolean flag = true;
        while(flag){
            flag = false;
        for(int bound = 0;bound<array.length;bound++) {
            for(int cur = 0;cur<array.length-1-bound;cur++) {
                if(array[cur]>array[cur+1]) {
                    swap(array,cur,cur+1);
                    flag = true;
                }
            }

        }
        }
    }
    public static void swap(int []array,int i,int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    public static void main(String[] args) {
       int []array = {4,1,3,6,9,7,5,0};
       sort(array);
        System.out.println(Arrays.toString(array));
    }
}
