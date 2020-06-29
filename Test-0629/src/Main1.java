
import java.util.Scanner;

public class Main1{
    private static String[] num = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖","拾"};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while( sc.hasNext() ){
            double n = sc.nextDouble();
            StringBuffer sb = new StringBuffer();
            sb.append("人民币");
            int yi = (int)n/100000000;
            if(yi!=0){
                sb.append( toChinese(yi) );
                sb.append("亿");
            }
            n=n%100000000;

            int wang = (int)n/10000;
            if(wang != 0){
                sb.append( toChinese(wang) );
                sb.append("万");
            }
            n=n%10000;

            int qiang = (int)n;
            if(qiang != 0){
                sb.append( toChinese(qiang) );
            }


            String s1 = String.valueOf(n);
            String[] s2 = s1.split("\\.");
            int n1 = 0;
            if(s2[1].length() == 2) {
                n1 = (s2[1].charAt(0) - '0') * 10 + (s2[1].charAt(1) - '0');
            }else{
                n1 = (s2[1].charAt(0) - '0') * 10 ;
            }

            sb.append( fenToChinese(n1) );
            System.out.println( sb.toString() );



        }
    }
    private static String toChinese(int n){



        StringBuffer sb = new StringBuffer();
        int qian = n/1000;
        if(qian != 0){
            sb.append(num[qian]);
            sb.append("仟");
        }
        n=n%1000;

        int bai = n/100;
        if(bai != 0){
            sb.append(num[bai]);
            sb.append("佰");
        }
        n = n%100;

        int shi = n/10;
        if(shi!=0){
            if(shi != 1){
                sb.append(num[shi]);
            }

            sb.append("拾");
        }
        n=n%10;

        int ge = n;
        if(ge != 0){
            sb.append(num[ge]);
            sb.append("元");
        }
        return sb.toString();
    }

    private static String fenToChinese(int n){
        StringBuffer sb = new StringBuffer();
        if(n >= 10){
            int jiao = n/10;
            sb.append(num[jiao]);
            sb.append("角");
            n = n%10;
        }

        int fen = n;
        if(fen != 0 ){
            sb.append( num[fen] ) ;
            sb.append("分");
        }

        return sb.toString();
    }}