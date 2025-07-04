/*
 * Problem Title - Merge Sort
 * Topic - Sorting algos
 * Approach: Uses divide and conquer strategy. Recursively divides the array into halves, sorts each half, and then merges the sorted halves to get the final sorted array.
 * Time Complexity: O(n log n) - Best, average, and worst cases
 * Space Complexity: O(n) – Not in-place, extra space needed for merging
 * Input Example: [4, 2, 5, 3, 1]
 * Output Example: [1, 2, 3, 4, 5]
 */

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {4, 2, 5, 3, 1};

        mergeSort(array,0,array.length-1);

        System.out.println("Sorted array:");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }

    static void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;

            mergeSort(a, l, mid);
            mergeSort(a, mid + 1, r);

            merge(a, l, mid, r);
        }
    }

    static void merge(int[] a, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; ++i)
            left[i] = a[l + i];
        for (int j = 0; j < n2; ++j)
            right[j] = a[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }

        while (i < n1)
            a[k++] = left[i++];

        while (j < n2)
            a[k++] = right[j++];
    }
}
