public class MinHeap {
    private int[] arr;   // heap array
    private int index;   // next available index (starts at 1)

    // Constructor
    public MinHeap(int arrSize) {
        arr = new int[arrSize + 1];  // +1 because we keep index 0 unused
        index = 1;
    }

    // Insert value into heap
    public void insert(int insertedValue) {
        if (index >= arr.length) {
            System.out.println("Heap is full");
            return;
        }
        arr[index] = insertedValue;
        swim(index);
        index++;
        System.err.println(insertedValue + " is inserted successfully!");
    }

    // Swim up to maintain heap property
    private void swim(int currentIndex) {
        if (currentIndex == 1) return; // root

        int parentIndex = currentIndex / 2;
        if (arr[parentIndex] > arr[currentIndex]) {
            swap(parentIndex, currentIndex);
            swim(parentIndex);
        }
    }

    // Remove min (root) element
    public int remove() {
        if (index <= 1) {
            System.out.println("Heap is empty");
            return -1; // return invalid
        }
        index--;
        int minValue = arr[1];
        arr[1] = arr[index];
        arr[index] = 0; // clear last slot
        sink(1);
        return minValue;
    }

    // Sink down to maintain heap property
    private void sink(int currentIndex) {
        if (currentIndex >= index) return;

        int leftChildIndex = 2 * currentIndex;
        int rightChildIndex = 2 * currentIndex + 1;

        if (leftChildIndex >= index) {
            return; // no left child
        } else {
            if (rightChildIndex >= index) { // only left child
                if (arr[currentIndex] > arr[leftChildIndex]) {
                    swap(currentIndex, leftChildIndex);
                    sink(leftChildIndex);
                }
            } else { // both children exist
                if (arr[leftChildIndex] < arr[rightChildIndex]) {
                    if (arr[leftChildIndex] < arr[currentIndex]) {
                        swap(currentIndex, leftChildIndex);
                        sink(leftChildIndex);
                    }
                } else {
                    if (arr[rightChildIndex] < arr[currentIndex]) {
                        swap(currentIndex, rightChildIndex);
                        sink(rightChildIndex);
                    }
                }
            }
        }
    }

    // Utility: swap elements
    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}