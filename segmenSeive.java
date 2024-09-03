import java.util.*;
public class SegmentedSeive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Lower Bound :");
		int l = sc.nextInt();
		System.out.println("Enter the Upper Bound :");
		int n = sc.nextInt();
		boolean[] array = new boolean[n+1];
		for(int i=2; i<=n; i++) {
			array[i] = true;
		}
		for(int i=2; i*i<=n; i++) {
			if(array[i]) {
				for(int j=i*i; j<=n; j+=i) {
					array[j] = false;
				}
			}
		}
		System.out.println("Prime numbers between "+l+" and "+n+" :");
		for(int i=l; i<=n; i++) {
			if(array[i]) {
				System.out.print(i+" ");
			}
		}

	}

}
