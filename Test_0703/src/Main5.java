import java.util.Scanner;

public class Main5 {
    //给定一个有n个正整数的数组A和一个整数sum,求选择数组A中部分数字和为sum的方案数。
    //当两种选取方案有一个数字的下标不一样,我们就认为是不同的组成方案。
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            int sum=scanner.nextInt();
            int[] A=new int[n];
            for(int i=0;i<n;i++)
                A[i]=scanner.nextInt();
            long[][] dp=new long[n+1][sum+1];  //dp[i][j]表示用前i个值组成和为j的方案个数
            //前i个组成和为0的方案只有1种，即什么都不选
            for(int i=0;i<=n;i++){
                dp[i][0]=1;
            }
            //用0个元素不能组成1-sum
            for(int j=1;j<=sum;j++){
                dp[0][j]=0;
            }

            for(int i=1;i<=n;i++){
                for(int j=0;j<=sum;j++){
                    if(A[i-1]<=j){
                        dp[i][j]=dp[i-1][j]+dp[i-1][j-A[i-1]];
                    }else{
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
            System.out.println(dp[n][sum]);
        }
    }
}
