import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int year1 = scanner.nextInt();
        int year2 = scanner.nextInt();
        int year = scanner.nextInt();
        int dead = scanner.nextInt();

    }
public static int get(int year) {
    int num = 1;
    for(int i = 1;i<=year; i++) {
        if(i==2) {
         num+=get(year-2)   ;
        }else if(i==4) {
            num+=get(year-4);
        }else  if(i==5) {
            num--;
        }

    }
    return num;
}


}
