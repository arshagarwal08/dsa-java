/*
 * Problem Title - Quick Sort
 * Topic - Sorting algos
 * Approach: Uses divide and conquer strategy. Selects a pivot element, partitions the array such that elements smaller than pivot go to the left and greater to the right, then recursively sorts both parts.
 * Time Complexity: O(n^2) - Worst case (when pivot is the smallest/largest), O(n log n) - Best and average case
 * Space Complexity: O(log n) – Due to recursive call stack
 * Input Example: [4, 2, 5, 3, 1]
 * Output Example: [1, 2, 3, 4, 5]
 */

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {4, 2, 5, 3, 1};

        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);

            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }

    static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
    }
}
