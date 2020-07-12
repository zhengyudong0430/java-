import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            char a[] = scanner.nextLine().toCharArray();
            int res = 0;
            for(int i = a.length-1;i>1;i--) {
                if(a[i]=='A') {
                    res+=10*Math.pow(16,(a.length-1)-i);
                }
                else if(a[i]=='B') {
                    res+=11*Math.pow(16,(a.length-1)-i);
                }
                else if(a[i]=='C') {
                    res+=12*Math.pow(16,(a.length-1)-i);
                }
                 else if(a[i]=='D') {
                    res+=13*Math.pow(16,(a.length-1)-i);
                }
                else if(a[i]=='E') {
                    res+=14*Math.pow(16,(a.length-1)-i);
                }else if(a[i]=='F'){
                    res+=15*Math.pow(16,(a.length-1-i));
                }else {
                    res +=Integer.valueOf(a[i]+"")*Math.pow(16,(a.length-1-i));
                }
            }
            System.out.println(res);
        }
    }
}
