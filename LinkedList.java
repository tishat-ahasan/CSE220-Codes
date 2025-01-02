// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LinkedList {
    static class Node{
        int elem;
        Node next;
        Node(int d){
            elem = d;
            next = null;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        Node x = create_LL(arr);
        print_LL(x);
        System.out.println();
        Node y = insert(x, 2, 100);
        print_LL(y);
        System.out.println();
        Node z = remove(y, 4);
        print_LL(z);
        System.out.println();
    }
    
    public static void print_LL(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.elem + " ");
            temp = temp.next;
        }
    }
    
    public static Node create_LL(int[] arr){
        Node head = new Node(arr[0]);
        Node tail = head;
        for (int i = 1; i <arr.length; i++){
            Node new_node = new Node(arr[i]);
            tail.next = new_node;
            tail = new_node;
        }
        return head;
    }
    
    public static Node insert(Node head, int position, int new_value){
        Node temp = head;
        int count = 0;
        while (temp != null){
            if (count == position){
                Node new_node = new Node(new_value);
                new_node.next = temp.next;
                temp.next = new_node;
                return head;
            }
            else {
                count += 1;
                temp = temp.next;
            }
        }
        return head;
    }
    
    public static Node remove(Node head, int position){
        Node temp = head;
        int count = 0;
        while (temp != null){
            if (count == position-1){
                Node x = temp.next;
                temp.next = temp.next.next;
                x.next = null;
                return head;
            }
            else {
                count += 1;
                temp = temp.next;
            }
        }
        return head;
    }
    
    
    
    

}