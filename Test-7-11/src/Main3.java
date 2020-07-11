import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x0 = scanner.nextInt();
            int y0 = scanner.nextInt();
            int z0 = scanner.nextInt();
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int z1 = scanner.nextInt();
             double r =  Math.sqrt(Math.pow(x1-x0,2)+Math.pow(y1-y0,2)+Math.pow(z1-z0,2));
            double v = (4/3.0)*Math.acos(-1)*Math.pow(r,3);
            System.out.println(String.format("%.3f",r)+" "+String.format("%.3f",v));
        }
    }
}
