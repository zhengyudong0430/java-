

import java.util.Scanner;
import java.util.ArrayList;
public class Main1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            char[] ch = sc.nextLine().toCharArray();
            String str = sc.nextLine();
            ArrayList<Character> lt = new ArrayList<>();
            for(int i=0;i<ch.length;i++){
                String c = String.valueOf(ch[i]);
                if(!str.contains(c)){
                    if(ch[i]>='a' && ch[i]<='z'){
                        ch[i]=(char)(ch[i]-32);
                    }
                    if(!lt.contains(ch[i])){
                        lt.add(ch[i]);
                    }
                }
            }
            for(Character cc : lt){
                System.out.print(cc);
            }
        }
    }
}