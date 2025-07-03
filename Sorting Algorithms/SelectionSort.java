/*
 * Problem Title - Selection Sort
 * Topic - Sorting algos
 * Approach: Find the minimum element from the unsorted part and swap it with the beginning
 * Time Complexity: O(n^2)
 * Space Complexity: O(1) – In-place sorting
 * Input Example: [4,2,5,3,1]
 * Output Example: [1,2,3,4,5]
 */


public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {4,2,5,3,1};

        selectionSort(array);

        System.out.println("Sorted array");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }

    static void selectionSort(int[] a){
        int n = a.length;
        for(int i=0;i<n-1;i++){
            int x = i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[x]){
                    x=j;
                }
            }

            if(x!=i){
                int t = a[x];
                a[x] = a[i];
                a[i] = t;
            }
        }
    }
}
