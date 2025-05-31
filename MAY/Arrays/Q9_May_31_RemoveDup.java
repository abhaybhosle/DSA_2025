/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
*/
import java.util.*;

public class Q9_May_31_RemoveDup {
        public static int removeDuplicate1(int nums[]){
        //Brute force - Pehle set mae dalo
        Set<Integer> set = new LinkedHashSet<>();
        for(int num:nums){
            set.add(num);
        }
        //phir set se array mae dal and return length
        int i = 0;
        for(int num:set){
            nums[i++] = num;
        }
        return set.size();
    }
    public static int removeDuplicate(int nums[]){
        //optimized - striver logic
        int i = 0, n = nums.length;
        for(int j = 1; j < n; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,2,2,3,3};
        int res = removeDuplicate1(nums);
        System.out.println(res);
        
    }
}
