import java.util.Scanner;
public class Main17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int year = scanner.nextInt();
            int mouth = scanner.nextInt();
            int day = scanner.nextInt();
            System.out.println(whichDay(year, mouth, day));
        }
    }

    private static int whichDay(int year, int mouth, int day) {
        int num[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(year<0||mouth<1||mouth>12||day<1||day>31) {
            return -1;
        }
        if((year%4==0&&year%100!=0)||year%400==0) {
            num[1] = 29;
        }
        int date = 0;
        for(int i = 0; i<mouth-1; i++) {
            date+=num[i];
        }
        date+=day;
        return date;
    }
}
