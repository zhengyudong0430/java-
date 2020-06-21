public class Main {
    public static void main(String[] args) {
        int sumM = 0;
        int sumN = 0;
        int j = 1;
        for(int i = 0; i<30; i++) {
            sumM+=10;
            sumN+=j;
            j*=2;
        }
        System.out.println(sumM+""+sumN);

    }
}
