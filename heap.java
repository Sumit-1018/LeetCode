public class heap {
    int capacity;
    int heapSize;
    int[] array;
    
    public heap(int capacity) {
        this.capacity = capacity;
        heapSize = 0;
        array = new int[capacity];
    }
    
    public void insert(int value) {
        if (heapSize == capacity) {
            System.out.println("Heap is full. Cannot insert.");
            return;
        }
        
        array[heapSize] = value;
        heapifyUp(heapSize++);
    }
    public int delete(int value) {
        int index = find(value);
        if (index == -1) {
            System.out.println("Value not found in heap.");
            return -1;
        }
        
        int temp = array[index];
        array[index] = array[--heapSize];
        heapifyDown(index);
        
        return temp;
    }
    public int peek() {
        if (heapSize == 0) {
            System.out.println("Heap is empty.");
            return -1;
        }
        
        return array[0];
    }
    
    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        
        while (index > 0 && array[parentIndex] < array[index]) {
            swap(parentIndex, index);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }
    private void heapifyDown(int index) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int largestIndex = index;
        
        if (leftChildIndex < heapSize && array[leftChildIndex] > array[largestIndex]) {
            largestIndex = leftChildIndex;
        }
        
        if (rightChildIndex < heapSize && array[rightChildIndex] > array[largestIndex]) {
            largestIndex = rightChildIndex;
        }
        
        if (largestIndex!= index) {
            swap(largestIndex, index);
            heapifyDown(largestIndex);
        }
    }
    private int find(int value) {
        for (int i = 0; i < heapSize; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void main(String[] args) {
        heap heap = new heap(10);
        
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(2);
        heap.insert(7);
        heap.insert(4);
        heap.insert(6);
        heap.insert(9);
        System.out.println("Peek: " + heap.peek());
        
        System.out.println("Delete 5: " + heap.delete(5));
        System.out.println("Delete 1: " + heap.delete(1));
        
        System.out.println("Peek: " + heap.peek());
    }
}
