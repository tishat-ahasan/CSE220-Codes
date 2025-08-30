public class Main2 {
    public static void main(String[] args) {
        
        MinHeap heap = new MinHeap(10);
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(2);
        heap.insert(7);

        

        System.out.println("Removed: " + heap.remove());
        

        System.out.println("Removed: " + heap.remove());
        
    }
}