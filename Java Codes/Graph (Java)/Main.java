// Adjacency matrix representation
public class Main{
  public static int[][] adjacency_matrix(){
    int[][] graph = new int[5][5];
    graph[0][2] = 15;
    graph[0][4] = 7;
    graph[1][2] = 10;
    graph[1][3] = 19;
    graph[1][4] = 12;
    graph[2][0] = 15;
    graph[2][1] = 10;
    graph[2][3] = 20;
    graph[3][1] = 19;
    graph[3][2] = 20;
    graph[3][4] = 8;
    graph[4][0] = 7;
    graph[4][1] = 12;
    graph[4][3] = 8;
    return graph;
  }
  
  public static void print_adjacency_matrix(int[][] array){
   for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t"); 
            }
            System.out.println(); 
        } 
  }
  public static void main(String[] args){
    System.out.println("ABCD");
    int[][] graph = adjacency_matrix();
    print_adjacency_matrix(graph);
  }
  
}