import java.util.*;
public class Seive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		boolean[] array = new boolean[n+1];
		for(int i= 2; i<=n; i++) {
			array[i] = true;
		}
		for(int i=2; i*i<=n; i++){
			if(array[i]) {
				for(int j=i*i; j<=n; j+=i) {
					array[j] = false; 
				}
			}
		}
		System.out.println("Prime numbers between 2 to "+n+":");
		for(int i=2; i<=n; i++) {
			if(array[i]) {
				System.out.print(i+" ");
			}
		}

	}

}
