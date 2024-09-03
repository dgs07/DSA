import java.util.*;

public class graph_colouring {
    int V;
    int[] colors;
    int[][] graph;

    public graph_colouring(int vertices) {
        V = vertices;
        colors = new int[V];
        Arrays.fill(colors, 0);
        graph = new int[V][V];
    }

    public boolean isSafe(int v, int c) {
        for (int i = 0; i < V; i++) {
            if (graph[v][i] == 1 && c == colors[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean graphColoringUtil(int m, int v) {
        if (v == V) {
            return true;
        }

        for (int c = 1; c <= m; c++) {
            if (isSafe(v, c)) {
                colors[v] = c;
                if (graphColoringUtil(m, v + 1)) {
                    return true;
                }
                colors[v] = 0;
            }
        }
        return false;
    }

    public boolean graphColoring(int m) {
        return graphColoringUtil(m, 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();
        graph_colouring graph = new graph_colouring(vertices);

        System.out.println("Enter the adjacency matrix of the graph:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                graph.graph[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the number of colors: ");
        int m = scanner.nextInt();

        if (graph.graphColoring(m)) {
            System.out.println("Solution exists with " + m + " colors:");
            for (int i = 0; i < vertices; i++) {
                System.out.println("Vertex " + i + ": Color " + graph.colors[i]);
            }
        } else {
            System.out.println("No solution exists with " + m + " colors.");
        }

        scanner.close();
    }
}