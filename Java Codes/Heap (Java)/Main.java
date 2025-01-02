import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Create a max heap with capacity 10
        MaxHeap maxHeap = new MaxHeap(10);

        // Insert elements into the max heap
        maxHeap.insert(20);
        maxHeap.insert(15);
        maxHeap.insert(30);
        maxHeap.insert(10);
        maxHeap.insert(5);
        maxHeap.insert(40);
        maxHeap.insert(100);

        // Print the heap
        maxHeap.printHeap();
        maxHeap.remove();
        maxHeap.remove();
        maxHeap.printHeap();
        
        int[] sorted_array = maxHeap.heap_sort();
        
        System.out.println("Sorted Array with remaining elements: "+ Arrays.toString(sorted_array));
        
        
    }
}
