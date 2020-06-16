import java.math.BigInteger;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        BigInteger bigInteger = new BigInteger(s1);
        BigInteger bigInteger1 = new BigInteger(s2);
        System.out.println(bigInteger.add(bigInteger1));
    }
}
}
