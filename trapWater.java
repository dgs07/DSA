import java.util.*;

public class TrapRainWater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i =0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		int l[] = new int[N];
		int r[] = new int[N];
		l[0] = arr[0];
		for(int i = 1; i<N; i++) {
			l[i] = Math.max(arr[i], l[i-1]);
			System.out.print(l[i]+" ");
		}
		System.out.println();
		r[N-1] = arr[N-1];
		for(int i = N-2; i>=0; i--) {
			r[i] = Math.max(arr[i], r[i+1]);
			System.out.print(r[i]+" ");
		}
		System.out.println();
		int sum = 0;
		for(int i =0; i<N; i++) {
			sum = sum + (Math.min(l[i], r[i])-arr[i]);
		}
		System.out.print(sum);
	}

}
