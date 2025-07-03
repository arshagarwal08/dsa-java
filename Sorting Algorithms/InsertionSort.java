/*
 * Problem Title - Insertion Sort
 * Topic - Sorting algos
 * Approach: Build the sorted array one element at a time by comparing the current element with the sorted portion and inserting it into its correct position.
 * Time Complexity: O(n^2) - Worst & average, O(n) - Best case (already sorted)
 * Space Complexity: O(1) – In-place sorting
 * Input Example: [4, 2, 5, 3, 1]
 * Output Example: [1, 2, 3, 4, 5]
 */


public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {4,2,5,3,1};

        insertionSort(array);
        System.out.println("Sorted Array:");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }

    static void insertionSort(int[] a){
        int n = a.length;

        for(int i=0;i<n-1;i++){
            int j = i+1;

            while(j>0 && a[j]<a[j-1]){
                int t = a[j];
                a[j] = a[j-1];
                a[j-1] = t;
                j--;
            }
        }
    }
}
