package org.tfoc;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public Integer search(
            Integer[] nums,
            Integer target) {

        int result = -1;
        if(nums!= null &&nums.length > 0) {
            int left = 0;
            int right = nums.length -1;
            int middle = 0;
            while(left < right - 1) {
                middle = left + ((right - left) / 2);
                if (nums[middle] > target) {
                    right = middle;
                } else {
                    left = middle;
                }
            }
            if(nums[left].equals(target))
                result = left;
            else if(nums[right].equals(target))
                result = right;
        }

        return result;
    }

}
