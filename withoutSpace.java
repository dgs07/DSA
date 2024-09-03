import java.util.*;

public class withoutSpace {
	static void sortQueue(Queue<Integer> queue) {
		int n = queue.size();
		for(int i =0; i<n; i++) {
			int minIndex = -1;
			int minValue = Integer.MAX_VALUE;
			for(int j=0; j<n; j++) {
				int curr = queue.poll();
				if(curr< minValue && j<(n-i)) {
					minValue = curr;
					minIndex = j;
				}
				queue.add(curr);
			}
			//removing min value from queue
			for(int j =0; j<n; j++) {
				int curr = queue.poll();
				if(j!=minIndex) {
					queue.add(curr);
				}
			}
			//add min value at end
			queue.add(minValue);
		}
		//print
		for(int i : queue) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0; i<n ;i++) {
			int e = sc.nextInt();
			q.add(e);
		}
		sortQueue(q);

	}

}
