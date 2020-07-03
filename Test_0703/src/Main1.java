import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            char arr[] = s.toCharArray();
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            for(int i = 0; i<arr.length; i++) {
              if(arr[i]>='0'&&arr[i]<='9') {
                  a = 1;
              }
              else if(arr[i]>='a'&&arr[i]<='z') {
                  b = 1;
              }
              else if(arr[i]>='A'&&arr[i]<='Z') {
                  c = 1;
              }else {
                  d = 1;
              }
            }
            boolean e = false;
            for(int i = 0; i<s.length()-3; i++) {
                for(int j = i+1; j<s.length()-3; j++) {
                    if(s.substring(i,i+3).equals(s.substring(j,j+3))){
                       e = true;
                    }
                }
            }
            if(e==true||s.length()<=8||a+b+c+d<3){
                System.out.println("NG");
            }else{
                System.out.println("OK");
            }
        }
    }
}
