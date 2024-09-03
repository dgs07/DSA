import java.util.*;

public class celebrity {
	static int findCelebrity(int mat[][]) {
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<mat.length; i++) {
			st.push(i);
		}
		while(st.size()>1) {
			int col = st.pop();
			int row = st.pop();
			if(mat[row][col] == 1) {
				st.push(col);
			}else {
				st.push(row);
			}
		}
		int x = st.pop();
		for(int j =0; j<mat.length; j++) {
			if(j==x) {
				continue;
			}
			if(mat[x][j]==1) {
				return -1;
			}
		}
		
		for(int i =0; i<mat.length; i++) {
			if(i==x) {
				continue;
			}
			if(mat[i][x]==0) {
				return -1;
			}
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int mat[][] = new int[r][c];
		for(int i=0; i<r; i++) {
			for(int j =0; j<c; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int res = findCelebrity(mat);
		if(res==-1) {
			System.out.println("No celebrity");
		}else {
			System.out.println(res);
		}

	}

}
