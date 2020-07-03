import java.util.ArrayList;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<String> resultList=new ArrayList<>();
        while(s.hasNextLine()){
            String s1=s.nextLine();
            if(s1.length()<9){
                resultList.add("NG");
                continue;
            }
            boolean hasNumber=false;
            boolean hasSmall=false;
            boolean hasBig=false;
            boolean hasOthers=false;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)>47&&s1.charAt(i)<59){
                    hasNumber=true;
                }else if(s1.charAt(i)>64&&s1.charAt(i)<91){
                    hasBig=true;
                }else if(s1.charAt(i)>96&&s1.charAt(i)<123){
                    hasSmall=true;
                }else {
                    hasOthers=true;
                }
            }
            int number=0;
            if(hasNumber==true)
                number++;
            if(hasBig==true)
                number++;
            if(hasOthers==true)
                number++;
            if(hasSmall==true)
                number++;
            if(number<3){
                resultList.add("NG");
                continue;
            }
            boolean isRepeat=false;
            for(int i=0;i<s1.length()-3;i++){
                for(int j=i+1;j<s1.length()-3;j++){
                    if(s1.substring(i,i+3).equals(s1.substring(j,j+3))){
                        isRepeat=true;
                    }
                }
            }
            if(isRepeat){
                resultList.add("NG");
            }else{
                resultList.add("OK");
            }
        }
        for(int i=0;i<resultList.size();i++){
            System.out.println(resultList.get(i));
        }
    }
}