import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.next();
            int i = in.nextInt();
            System.out.println(judge(s, i));
        }
    }

    private static String judge(String s, int i) {
    if(s.length()>8||s.length()<8) {

        return "error";
    }
    for(int j = 0; j<s.length(); j++) {
        if(s.charAt(j)<'0'||s.charAt(j)>'9') {
         return "error";
        }
    }
    s = s.substring(0,i-1)+s.substring(i);
     //   System.out.println(s);
      int []arr = new int[7];
      for(int k = 0; k<s.length(); k++) {

          arr[k] = Integer.parseInt(s.charAt(k)+"");
      }

        Arrays.sort(arr);
        String str = "";
        for(int j = arr.length-1; j>=0; j--) {
            str+=arr[j];
        }
       return str;
    }

}