import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 将整数转换成A-Z编号的字符串
     * @param n int整型 大于0的整数
     * @return string字符串
     */
    public String intToAZ (int n) {
        // write code here
      char []arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        String str = "";
        if(n>26) {
            while(n>1){
                while((n/26)>26) {
                    str+=intToAZ(n/26);
                }
                str+=arr[ (n / 26)-1];
                str+=arr[(n%26)-1];
                n/=26;
            }
        }else {
            str+=arr[n-1];
        }
        return str;
    }
}
