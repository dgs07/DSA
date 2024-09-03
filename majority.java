import java.util.*;
import java.util.HashMap;
public class majority {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int max = 0;
		int c = 0;
		int ind =0;
		HashMap<Integer, Integer> h = new HashMap<>();
		for(int i =0; i<n; i++) {
			h.put(arr[i],0);
		}
		for(int i =0; i<n; i++) {
			c = h.get(arr[i])+1;
			h.put(arr[i],c);
			if(c>max) {
				max = c;
				ind = i;
			}
		}
		if(max>n/2) {
			System.out.println("Majority element is "+arr[ind]);
		}
		else {
			System.out.println("No majority element");
		}

	}

}
