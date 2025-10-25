package Heaps;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Basics1 {

}


class MaxHeap {
    private int[] heap;
    private int size;

    public MaxHeap(int capacity) {
        heap = new int[Math.max(1, capacity)];
        size = 0;
    }

    // Build heap from existing array (bottom-up, O(n))
    public MaxHeap(int[] arr, boolean build) {
        // if build==true treat arr as initial data and build heap in-place
        heap = Arrays.copyOf(arr, arr.length);
        size = arr.length;
        if (build) buildHeap();
    }

    // Insert value (sift-up) — O(log n)
    public void insert(int val) {
        ensureCapacity();
        heap[size] = val;
        siftUp(size);
        size++;
    }

    // Return max (root) in O(1)
    public int peek() {
        if (size == 0) throw new NoSuchElementException("Heap is empty");
        return heap[0];
    }

    // Extract max (remove root) — O(log n)
    public int extractMax() {
        if (size == 0) throw new NoSuchElementException("Heap is empty");
        int max = heap[0];
        heap[0] = heap[size - 1]; // move last to root
        size--;
        siftDown(0);
        return max;
    }

    // Build heap from current array in O(n)
    private void buildHeap() {
        // last non-leaf node index = (size/2) - 1
        for (int i = (size / 2) - 1; i >= 0; i--) {
            siftDown(i);
        }
    }

    // In-place heap sort (ascending). This modifies the array argument.
    // Complexity: O(n log n) time, O(1) extra space.
    public static void heapSort(int[] arr) {
        int n = arr.length;
        // build max-heap in-place
        for (int i = (n / 2) - 1; i >= 0; i--) {
            siftDownStatic(arr, n, i);
        }
        // extract max one-by-one and place it at the end
        for (int end = n - 1; end > 0; end--) {
            swap(arr, 0, end);                // move current max to arr[end]
            siftDownStatic(arr, end, 0);      // restore heap for reduced size
        }
    }

    // -------- Helper methods --------
    private void ensureCapacity() {
        if (size >= heap.length) {
            heap = Arrays.copyOf(heap, heap.length * 2);
        }
    }

    private void siftUp(int idx) {
        while (idx > 0) {
            int parent = (idx - 1) / 2;
            if (heap[parent] >= heap[idx]) break;
            swap(heap, parent, idx);
            idx = parent;
        }
    }

    private void siftDown(int idx) {
        int half = size / 2; // nodes beyond this are leaves
        while (idx < half) { // while node has at least one child
            int left = 2 * idx + 1;
            int right = left + 1;
            int largest = left;

            if (right < size && heap[right] > heap[left]) {
                largest = right;
            }

            if (heap[idx] >= heap[largest]) break;

            swap(heap, idx, largest);
            idx = largest;
        }
    }

    // Static version for heapSort using arbitrary array and heapSize
    private static void siftDownStatic(int[] arr, int heapSize, int idx) {
        int half = heapSize / 2;
        while (idx < half) {
            int left = 2 * idx + 1;
            int right = left + 1;
            int largest = left;

            if (right < heapSize && arr[right] > arr[left]) {
                largest = right;
            }
            if (arr[idx] >= arr[largest]) break;
            swap(arr, idx, largest);
            idx = largest;
        }
    }

    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public int getSize() {
        return size;
    }

    // For debug / notes: return copy of internal array portion that is used
    public int[] toArray() {
        return Arrays.copyOf(heap, size);
    }

    // Simple demo in main
    public static void main(String[] args) {
        // Demo: build from array
        int[] arr = {3, 1, 6, 5, 2, 4};
        MaxHeap h = new MaxHeap(arr, true); // builds heap in O(n)
        System.out.println("Heap built (array form): " + Arrays.toString(h.toArray()));
        // Insert
        h.insert(10);
        System.out.println("After insert 10: " + Arrays.toString(h.toArray()));
        // Extract
        System.out.println("Extract max: " + h.extractMax());
        System.out.println("After extract: " + Arrays.toString(h.toArray()));
        // Heap sort
        int[] toSort = {12, 11, 13, 5, 6, 7};
        MaxHeap.heapSort(toSort);
        System.out.println("HeapSorted ascending: " + Arrays.toString(toSort));
    }
}
