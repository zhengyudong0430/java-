package text_0601;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    String result = "";
    char[] array = str.toCharArray();
    int count = 0;
    for(int i = 0; i<array.length; i++) {
        if(array[i]>='0' && array[i]<='9') {
             count = 1;
            int index = i;
            for(int j = i+1; j<array.length; j++) {
                if(array[j]>='0'&& array[j]<='9') {
                    count++;
                    index = j;
                }else{
                    break;
                }
            }
            if(count>result.length()) {
                result = str.substring(i,index+1);
            }else{
                continue;
            }
        }
    }
        System.out.println(result);
    }
}