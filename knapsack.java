import java.util.Arrays;
import java.util.Scanner;

import java.util.Comparator;

public class fractional_knapsack {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int wei=input.nextInt();
        int[] profit=new int[n];
        int[] weight=new int[n];
        for(int i=0;i<n;i++){
            weight[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            profit[i]=input.nextInt();
        }
        int[][] temp = new int[n][2];

        for(int i=0;i<n;i++){
            temp[i][0]= profit[i]/ weight[i];
            temp[i][1]=i;
        }
        Arrays.sort(temp, Comparator.comparingInt(a -> a[0]));

        float ans=0;

        for(int i = n - 1; i >= 0; i--) {

            int index = temp[i][1];
            if (wei > weight[index]) {
                ans += profit[index];
                wei -= weight[index];
            } else {
                ans += profit[index] * (wei / (weight[index])*1.0); 
                break;
            }

        }
        System.out.println(ans);
    }
}
