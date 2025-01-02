public class Node {
    int v;   // connected vertex
    int e_w; //edge weight
    Node next;  
    public Node(int v, int e_w) {
        this.v = v;
        this.e_w = e_w;
        this.next = null; 
    }
}