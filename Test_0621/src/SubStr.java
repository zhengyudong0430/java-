import java.util.*;

 class Substr {
    public static  boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean []result = new boolean[n];
        char []arr = s.toCharArray();

        for(int i = 0; i<s.length; i++) {
            for(int j = 0; j<s.length(); j++) {
            if(p[i].equals(arr[j])) {
                result[i] = true;
            }else {
                result[i] = false;
            }
            }
        }
        return result;
    }

    public static void main(String[] args) {
String []p = {"a","b","c","d"};
String s = "abc";
int n = 4;
boolean []a =chkSubStr(p,n,s);
for(int i = 0; i<a.length; i++) {
    System.out.println(a[i]);
}
    }
}
