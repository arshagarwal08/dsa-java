/*
 * Problem - Check if array is sorted and rotated (Leetcode #1752)
 * Difficulty - Easy
 * Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
 * Topic - Arrays
 * 
 * Approach -  
 * 1. A sorted and rotated array will have *at most one* "drop" (i.e., a[i] > a[i+1]).
 * 2. Traverse the array and count how many times a[i] > a[i+1].
 *    - If this happens more than once, it's not sorted and rotated.
 * 3. Also check circular condition at the end: a[n-1] > a[0] should count as a drop too.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int[] array = {3,4,5,1,2};

        if(check(array)){
            System.out.println("Yes, array is sorted and rotated");
        }else{
            System.out.println("Array is not sorted");
        }
    }
    static boolean check(int []a){
        int count=0,n=a.length;

        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]) count++;
        }

        if(a[n-1]>a[0]) count++;
        
        return count<=1;
    }
}
