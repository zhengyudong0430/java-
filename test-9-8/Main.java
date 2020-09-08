public class Main {
    public static void moveZero(int []arr) {
        int j = 0;
      for(int i = 0; i<arr.length; i++) {
          if(arr[i]!=0) {
              arr[j] = arr[i];
              j++;
          }
      }
      for(;j<arr.length;j++) {
          arr[j] = 0;
      }
    }

    public static void main(String[] args) {
        int []arr = {1,2,0,0,4};
        moveZero(arr);
        for(int i = 0; i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
