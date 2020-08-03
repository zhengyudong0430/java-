import java.util.Scanner;
public class Main11 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                char[] arr = sc.nextLine().toCharArray();
                StringBuilder sb = new StringBuilder("");
                StringBuilder str = new StringBuilder();
                for(int i=0;i<arr.length;i++){
                    if(arr[i]>='0' && arr[i]<='9'){
                        str.append(arr[i]);
                    }
                    if(arr[i]<'0' || arr[i] >'9' || i == arr.length-1){
                        if(str.length()>sb.length()){
                            sb = str;
                        }
                        str = new StringBuilder("");
                    }
                }
                System.out.println(sb);
            }
        }
    }


