import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int year1 = sc.nextInt();
            int year2 = sc.nextInt();
            int dead = sc.nextInt();
            int year = sc.nextInt();
            get(year1,year2,dead,year);
        }
    }

    private static void get(int year1, int year2, int dead, int year) {
    int num = 1;
    for (int i = 1; i<year; i++) {
        if(i==year1) {
            num+=get(year-year1);
        }
    }

    }
}
