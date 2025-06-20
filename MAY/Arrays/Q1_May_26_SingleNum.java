/* Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
Example 1:
Input: nums = [2,2,1]
Output: 1
Example 2:
Input: nums = [4,1,2,1,2]
Output: 4
*/

import java.util.HashSet;

public class Q1_May_26_SingleNum {
    // Approach 1 : Issues in space complexity
    
    public static int singleNum1(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.iterator().next();
    }
    
    // Approach 2 - Optimized - XOR [8 4 2 1] Rule
    //                          a ^ a = 0 , 0 ^ a = a
    public static int singleNum(int arr[]) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 2, 1, 2 };
        System.out.println(singleNum(arr));
    }
}