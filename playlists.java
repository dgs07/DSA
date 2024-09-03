import java.util.*;

public class plylists {
	static int play(int airTime, int[] songs,int n) {
		int sum = airTime;
		int count=0;
		for(int i=0 ;i<n-2; i++) {
			HashSet<Integer> hs = new HashSet<>();
			sum = airTime-songs[i];
			for(int j=i+1; j<n;j++) {
				if(hs.contains(sum-songs[j])) {
					count++;
				}
				hs.add(songs[j]);
			}
			
		}
		if(count>0) return count;
		else return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int airTime = sc.nextInt();
		int n = sc.nextInt();
		int songs[] = new int[n];
		int res = play(airTime,songs,n);
		System.out.println(res);
	}

}
