import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String []arr = scanner.nextLine().split(" ");
            for(int i = arr.length-1; i>=0; i--) {
                if(i==0) {
                    System.out.println(arr[i]);
                }else {
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
