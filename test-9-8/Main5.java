import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][]arr = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        while (scanner.hasNext()) {
            String str = scanner.next();
            for(int i = 0; i<str.length()-1; i++) {
                char c = str.charAt(i);
                char c = str.charAt(i+1);
                for(int j = 0; j<arr.length;j++) {
                    for(int k = 0; k<arr[i].length;k++) {
                        if(c==arr[j][k]&&){
                            System.out.println("false");
                        }
                    }
                }
                }
            }
        }
    }

