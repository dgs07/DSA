import java.util.*;

public class stackPermutation {
	static boolean check(Queue<Integer> ip, Queue<Integer> op, int n) {
		Stack<Integer> st = new Stack<>();
		while(!ip.isEmpty()) {
			st.push(ip.poll());
			while(!st.isEmpty() && st.peek()==op.peek()) {
				st.pop();
				op.poll();
			}
		}
		return op.isEmpty() && ip.isEmpty();
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> ip = new LinkedList<>();
		Queue<Integer> op = new LinkedList<>();
		for(int i =0; i<n; i++) {
			int e = sc.nextInt();
			ip.offer(e);
		}
		for(int i =0; i<n; i++) {
			int e = sc.nextInt();
			op.offer(e);
		}
		if(check(ip,op,n)) {
			System.out.println("yes");
		}else {
			System.out.println("Not Possible");
		}
	}

}
