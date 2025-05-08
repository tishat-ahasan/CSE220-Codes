import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] graph = new int [6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                graph[i][j] = 0;
            }
        }
        graph[0][5] = 15;
        graph[1][2] = 44; graph[1][5] =  8;
        graph[2][1] = 44; graph[2][3] = 9; graph[2][4] =  10;
        graph[3][2] = 9; graph[3][4] = 7; graph[3][5] =  15;
        graph[4][2] = 10; graph[4][3] =  7;
        graph[5][0] = 15;  graph[5][1] = 8; graph[5][3] = 15;
        for (int i = 0; i < 6; i++) {
            System.out.println(Arrays.toString(graph[i]));
        }
        BFS(graph, 0);
        System.out.println();
        DFS(graph, 0);
    }

    public static void BFS(int[][] graph, int start) {
        int total_vertex = graph.length;
        Queue Q = new Queue();
        boolean[] visited = new boolean[total_vertex];
        visited[start] = true;
        Q.enqueue(start);

        while (!Q.isEmpty()) {
            int u = Q.dequeue();
            System.out.print(u+" ");
            for (int v = 0; v < total_vertex; v++) {
                if (graph[u][v] != 0 && visited[v] == false) {
                    visited[v] = true;
                    Q.enqueue(v);
                }
            }
        }
    }

    public static void DFS(int[][] graph, int start) {
        int total_vertex = graph.length;
        Stack stk = new Stack();
        boolean[] visited = new boolean[total_vertex];
        visited[start] = true;
        stk.push(start);

        while (!stk.isEmpty()) {
            int u = stk.pop();
            System.out.print(u + " ");
            for (int v = 0; v < total_vertex; v++) {
                if (graph[u][v] != 0 && visited[v] == false) {
                    visited[v] = true;
                    stk.push(v);
                }
            }
        }
    }
}
