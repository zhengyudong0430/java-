import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String s = scanner.nextLine();
            boolean []sell = new boolean[s.length()];
            String s1 = scanner.nextLine();
            boolean []buy = new boolean[s1.length()];
            for(int i = 0; i<s.length(); i++) {
                sell[i] = true;
            }
            for (int j = 0; j<s1.length(); j++) {
                buy[j] = true;
            }
            int count = 0;
            for(int i = 0; i<s1.length(); i++) {

                for(int j = 0; j<s.length(); j++) {
                    if(s1.charAt(i)==s.charAt(j)&&buy[i] == true&&sell[j] == true) {
                        count++;
                        buy[i] = false;
                        sell[j] = false;
                        break;
                    }
                }
            }
            if(count==s1.length()) {
                int e = s.length()-count;
                System.out.println("Yes"+" "+e);
            }else{
                 int e = s1.length()-count;
                System.out.println("No"+" "+e);
            }
        }
    }
}
