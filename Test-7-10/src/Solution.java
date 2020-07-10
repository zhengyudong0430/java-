public class Solution {
    /**
     * 计算你能获得的最大收益
     *
     * @param prices Prices[i]即第i天的股价
     * @return 整型
     */
    public int calculateMax(int[] prices) {
        int sum = 0;
        int tmp;
       for(int i = 0; i<prices.length; i++) {
            tmp = getMax(prices,0,i)+getMax(prices,i,prices.length-1);
           if(tmp>sum) {
               sum = tmp;
           }
       }
       return sum;
    }

    private int getMax(int[] prices, int start, int end) {
        if(start>end) {
            return 0;
        }
        int min = prices[start];
        int max = 0;
        for(int i = start+1;i<=end; i++ ) {
            if(prices[i]<min) {
                min = prices[i];
            }
            if(prices[i]-min>max) {
                max = prices[i]-min;
            }
        }
        return max;
    }
}