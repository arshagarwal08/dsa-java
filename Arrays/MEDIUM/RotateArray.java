/*
 * Problem - Rotate Array (Leetcode #189)
 * Difficulty - Medium
 * Link: https://leetcode.com/problems/rotate-array
 * Topic - Arrays, Math, Two Pointers
 * Approach - 
 * 1. Reverse the entire array.
 * 2. Reverse the first k elements.
 * 3. Reverse the remaining n - k elements.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class RotateArray {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7}, k=3;

        rotate(array,k);

        System.out.print("After rotating: ");
        for(int i : array){
            System.out.print(i + " ");
        }

    }
    static void rotate(int[] a, int k) {
        int n = a.length;
        if(n<=1) return;
        k %= n;
        if(k==0) return;
        reverse(a,0,n-1);
        reverse(a,0,k-1);
        reverse(a,k,n-1);
    }
    static void reverse(int[] a,int i,int j){
        while(i<j){
            int t = a[i];
            a[i] = a[j];
            a[j] = t;

            i++;
            j--;
        }
    }
}
