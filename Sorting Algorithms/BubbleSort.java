/*
 * Problem Title - Bubble Sort
 * Topic - Sorting algos
 * Approach: Repeatedly swap alternate elements if they are in the wrong order. Largest elements move to the end with each pass.
 * Time Complexity: O(n^2) - Worst & average, O(n) - Best case (when already sorted)
 * Space Complexity: O(1) – In-place sorting
 * Input Example: [4,2,5,3,1]
 * Output Example: [1,2,3,4,5]
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {4,2,5,3,1};

        bubbleSort(array);

        System.out.println("Sorted array:");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }

    static void bubbleSort(int[] a){
        int n = a.length;

        for(int i=0;i<n-1;i++){
            boolean swap = false;
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    swap = true;
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
            if(!swap) break;
        }
    }
}
