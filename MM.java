import java.util.*;

public class MatrixMultiplication {
	public static int[][] dp=new int[1000][1000];

    public static int fun(int[] arr,int l,int r){

        if (l==r)  return 0;
        if (dp[l][r]!=-1){
            return dp[l][r];
        }
        int ans=100000000;
        for(int x=l;x<r;x++){
            ans=Math.min( ans,fun(arr,l,x)+fun(arr,x+1,r)+arr[l - 1] * arr[x] * arr[r]);
        }
        dp[l][r]=ans;
        //System.out.println(l+" "+r+" "+ans);
        return ans;
    }


	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        //int[] arr={1,2,3,4,3};
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(fun(arr,1,arr.length-1));

	}

}
