import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int []arr = new int[n];
            for(int i = 0; i<n; i++) {
                arr[i] = scanner.nextInt();
            }
            int []score = new int[n];
            double GPA = 0.00;
            for(int i = 0; i<n; i++) {
                score[i] = scanner.nextInt();
                if(score[i]>=90&&score[i]<=100) {
                    GPA += arr[i]*4.0;
                }
                if(score[i]>=85&&score[i]<=89) {
                    GPA += arr[i]*3.7;
               }if(score[i]>=82&&score[i]<=84) {
                GPA +=arr[i]*3.3;
                }
                if(score[i]>=78&&score[i]<=81) {
                    GPA += arr[i]*3.0;
                }
                if(score[i]>=75&&score[i]<=77) {
                    GPA += arr[i]*2.7;
                }
                if(score[i]>=72&&score[i]<=74) {
                    GPA += arr[i]*2.3;
                }
                if(score[i]>=68&&score[i]<=71) {
                    GPA +=arr[i] *2.0;
                }
                if(score[i]>=64&&score[i]<=67) {
                    GPA += arr[i]*1.5;
                }
                if(score[i]>=60&&score[i]<=63) {
                    GPA +=arr[i]*1.0;
                }
                if(score[i]<60) {
                    GPA += arr[i]*0.0;
                }
            }
            double sum = 0.0;
            for(int i = 0; i<n; i++) {
                sum+=arr[i];
            }
            System.out.printf("%.2f",GPA/sum);
        }
    }
}
