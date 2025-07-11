/*
 * Problem - Remove duplicates from sorted array (Leetcode #26)
 * Difficulty - EASY
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Topic - Arrays, Two Pointers
 * 
 * Approach - 
 * 1. Use two pointers:
 *    - `j` keeps track of the position for the next unique element.
 *    - `i` scans through the array.
 * 2. When a[i] != a[j], it means a new unique element is found.
 *    - Increment j and set a[j] = a[i].
 * 3. At the end, `j + 1` gives the count of unique elements.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int []array = {0,0,1,1,1,2,2,3,3,4};

        int x = removeDuplicates(array);
        System.out.println("Number of Unique elements: " + x);
        for(int i=0;i<x;i++) System.out.print(array[i] + " ");
    }
    static int removeDuplicates(int[] a){
        if(a.length==0) return 0;
        int j=0;
        for(int i=1;i<a.length;i++){
            if(a[j]!=a[i]){
                j++;
                a[j]=a[i];
            }
        }
        return j+1;
    }
}
