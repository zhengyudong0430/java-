import java.util.Scanner;
public class Main26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String res = scanner.nextLine();
            String str = "";
            for (int i = 0; i < res.length(); i++) {
                if ((res.charAt(i) >= 'a' && res.charAt(i) <= 'z') || (res.charAt(i) >= 'A' && res.charAt(i) <= 'Z')) {
                    str += res.charAt(i);
                } else {
                    str += " ";
                }
            }
            String[] arr = str.split(" ");
            for (int i = arr.length - 1; i >= 0; i--) {
                if (i != 0) {
                    System.out.print(arr[i] + " ");
                } else {
                    System.out.println(arr[i]);
                }
            }
        }
    }}
