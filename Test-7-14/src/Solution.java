public class Solution {

    public boolean Find(int target, int [][] array) {
        int i = 0;
        int j = array[0].length-1;
        while (j>=0&&i<array.length) {
            if(target<array[i][j]) {
                j--;
            }else if(target>array[i][j]) {
                i++;
            }else {
                return true;
            }
        }
        return false;
    }
}