import java.util.*;

public class maxEquSum {
	
	static int mes(int[] arr, int n) {
		int res = Integer.MIN_VALUE;
		for(int i = 0; i<n; i++) {
			int left_sum = arr[i];
			int right_sum = arr[i];
			for(int j=0; j<i; j++) {
				left_sum += arr[j];
			}
			for(int j=n-1; j>i; j--) {
				right_sum += arr[j];
			}
			if(left_sum == right_sum) {
				return Math.max(res, left_sum);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(mes(arr,n)); 
		

	}

}
