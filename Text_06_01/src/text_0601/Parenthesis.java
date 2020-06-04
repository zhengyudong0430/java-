package text_0601;

import java.util.*;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        char[] arrC = A.toCharArray();
        int num = 0;
        int i = 0;
        while(i < arrC.length && num >= 0){
            if(arrC[i] == '('){
                num++;
            }else if(arrC[i] == ')'){
                num--;
            }
            i++;
        }

        if(i < arrC.length || num != 0){
            return false;
        }
        return true;
    }
}


        public boolean chkParenthesis(String A, int n) {
        // write code here
        /*
         * 1.碰到")"开始弹出栈顶的"("，如果此时栈为空，则返回false
         * 2.碰到其他内容直接返回false
         * 3.字符串结尾时，栈非空返回false
         */
        Stack<Character> lefts = new Stack<Character>();
        if(A == null || A.length() != n){
        return false;
        }
        for(int i = 0; i < n; i++){
        if(A.charAt(i) == '(')
        {
        lefts.push(A.charAt(i));
        }
        else if(A.charAt(i) == ')')
        {
        if(lefts.empty()){
        return false;
        }
        else{
        lefts.pop();
        }
        }
        else{
        return false;
        }
        }
        if(!lefts.empty())
        {
        return false;
        }else{
        return true;
        }
        }