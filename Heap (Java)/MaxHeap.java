public class MaxHeap {
    private int[] heap;
    private int last_index;
    public MaxHeap(int capacity) {
        this.heap = new int[capacity];
        this.last_index = 1;
    }

    public void insert(int inserted_value){
      if (this.last_index >= this.heap.length){
            System.out.println("No space left in heap");
            return;
      }
        this.heap[this.last_index] = inserted_value;
        swim(this.last_index);
        this.last_index += 1;
        System.out.println(inserted_value + " is inserted successfully...");
        return;
    }
    
    private void swim(int child_index){
      if (child_index == 1){
            return;
      }
      int parent_index = child_index/2;
      if (this.heap[parent_index] < this.heap[child_index]){ //swap
            int temp = this.heap[parent_index];
            this.heap[parent_index] = this.heap[child_index];
            this.heap[child_index] = temp;
            this.swim(parent_index);
      }
        return;
    }
    
    public void printHeap() {
       
        for (int i = 0; i < this.last_index; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}
