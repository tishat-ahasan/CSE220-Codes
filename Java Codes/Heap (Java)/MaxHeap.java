public class MaxHeap {
    private int[] heap;
    private int last_index;
    public MaxHeap(int capacity) {
        this.heap = new int[capacity];
        this.last_index = 1;
    }

    // **************************** some helper functions ****************************
    private void swap(int i, int j){
      int temp = this.heap[i];
      this.heap[i] = this.heap[j];
      this.heap[j] = temp;
      return;
    }
    public void printHeap() {
      System.out.print("Current Heap values:" );
      for (int i = 1; i < this.last_index; i++) {
          System.out.print(heap[i] + " ");
      }
      System.out.println();
    }
    
    public int[] heap_sort(){
      int[] sorted_array = new int[this.last_index-1];
      for (int i=0; i< sorted_array.length; i++){
        sorted_array[i] = this.remove();
      }
      return sorted_array;
    }
    // **************************** Insert Function ****************************
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
      if (child_index <= 1){
        return;
      }
      int parent_index = child_index/2;
      if (this.heap[parent_index] < this.heap[child_index]){ //swap
            swap(parent_index, child_index);
            swim(parent_index);
      }
      return;
    }
    
    // **************************** Remove Function ****************************
    public int remove(){
      if (this.last_index == 1){
            System.out.println("nothing to remove in the heap");
            return -1;
      }
        //swap
        int temp = this.heap[1];
        this.last_index -= 1;
        swap(1, this.last_index);
        sink(1);
        System.out.println(temp +" is removed successfully...");
        return temp;
    }
    
    private void sink(int parent_index){

        int left_index = 2*parent_index;
        int right_index = 2*parent_index+1;
        if (left_index >= this.last_index && right_index >= this.last_index){
            return;
        }
      else if(left_index < this.last_index && right_index < this.last_index){
        if (this.heap[left_index] > this.heap[right_index]){
          swap(left_index, parent_index);
          sink(left_index);
        }
        else{
          swap(right_index, parent_index);
          sink(right_index);
        }
      }
      else if (left_index < this.last_index){
        swap(left_index, parent_index);
        sink(left_index);
      }
      return;
    }
    
    
}
