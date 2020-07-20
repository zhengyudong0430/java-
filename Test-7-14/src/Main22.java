import java.util.*;
public class Main22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            StringBuilder sb = new StringBuilder("");
            List<String> list = new ArrayList<>();
            int n = scanner.nextInt();
            for( int i = 0; i<n; i++) {
                 String s = scanner.next();
                 String s1 = phoneNum(s);
                 if(!sb.toString().contains(s1)) {
                     sb.append(s1);
                     list.add(s1);
                 }
            }
            Collections.sort(list);
            for(int i = 0; i<list.size(); i++) {
                System.out.println(list.get(i));
            }
            System.out.println();
        }
    }

    private static String  phoneNum(String s) {

        s = s.toUpperCase();
        String str = "";
        for(int j = 0; j<s.length(); j++) {
            if(s.charAt(j)>='0'&&s.charAt(j)<='9') {
                str+=s.charAt(j);
            }
            if(s.charAt(j)=='-') {
                continue;
            }
            if(s.charAt(j)>='A'&&s.charAt(j)<='C') {
                str += '2';
            }
            if(s.charAt(j)>='D'&&s.charAt(j)<='F') {
                str += '3';
            }
            if(s.charAt(j)>='G'&&s.charAt(j)<='I') {
                str += '4';
            }
            if(s.charAt(j)>='J'&&s.charAt(j)<='L') {
                str += '5';
            }
            if(s.charAt(j)>='M'&&s.charAt(j)<='O') {
                str+='6';
            }
            if(s.charAt(j)>='P'&&s.charAt(j)<='S') {
                str+='7';
            }
            if(s.charAt(j)>='T'&&s.charAt(j)<='V') {
                str+='8';
            }
            if(s.charAt(j)>='W'&&s.charAt(j)<='Z') {
                str+='9';
            }

        }
        str = str.substring(0,3)+"-"+str.substring(3);
        return str;

}

}
