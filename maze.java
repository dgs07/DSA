import java.util.*;

public class ratMaze {
	static boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol) {
		System.out.println(x+" "+y);
		if(x==maze.length-1 && y==maze[0].length-1&&maze[x][y]==1) {
			sol[x][y]=1;
			return true;
		}
		if(isSafe(maze,x,y)) {
			sol[x][y]=1;
			if(solveMazeUtil(maze,x+1,y,sol)) {
				return true;
			}
			if(solveMazeUtil(maze,x,y+1,sol)) {
				return true;
			}
			sol[x][y]=0;
			return false;
		}
		return false;
	}
	
	static boolean isSafe(int[][] maze, int x, int y) {
		return x>=0 && x<maze.length && y>=0 && y<maze[0].length && maze[x][y]==1;
	}
	
	static boolean solveMaze(int[][] maze) {
		int[][] sol = new int[maze.length][maze[0].length];
		if(!solveMazeUtil(maze,0,0,sol)) {
			System.out.println("solution doesn't exist");
			return false;
		}
		for(int i=0; i<sol.length; i++) {
			for(int j =0; j<sol[0].length; j++) {
				System.out.print(" "+sol[i][j]+" ");
			}
			System.out.println();
		}
		return true;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] maze = new int[m][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				maze[i][j] = sc.nextInt();
			}
		}
		sc.close();
		solveMaze(maze);

	}

}
