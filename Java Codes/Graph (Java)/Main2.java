// Adjacency matrix representation
public class Main2{
  public static void add_edge(Node[] graph, int u, int v, int e_w){
    Node new_node = new Node(v, e_w);
    new_node.next = graph[u];
    graph[u] = new_node;
  }
  public static Node[] create_adjacency_list(){
    Node[] graph = new Node[5];
    add_edge(graph, 0, 2, 15);
    add_edge(graph, 0, 4, 7);
    add_edge(graph, 1, 2, 10);
    add_edge(graph, 1, 3, 19);
    add_edge(graph, 1, 4, 12);
    add_edge(graph, 2, 0, 15);
    add_edge(graph, 2, 1, 10);
    add_edge(graph, 2, 3, 20);
    add_edge(graph, 3, 1, 19);
    add_edge(graph, 3, 2, 20);
    add_edge(graph, 3, 4, 8);
    add_edge(graph, 4, 0, 7);
    add_edge(graph, 4, 1, 12);
    add_edge(graph, 4, 3, 8);
    return graph;
  }
  public static void print_LL(Node head){
    Node temp = head;
    while (temp!= null){
        System.out.print("Connected to " + temp.v + ", edge weight = " +temp.e_w+"\n");
        temp =temp.next;
    }
    
    return;
  }
  public static void main(String[] args){
    System.out.println("ABCD");
    Node a = new Node(2, 15);
    Node [] graph = create_adjacency_list();
    System.out.println("For vertex 1:");
    print_LL(graph[1]);
  }
  
}