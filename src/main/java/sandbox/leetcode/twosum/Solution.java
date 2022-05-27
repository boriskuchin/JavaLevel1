package sandbox.leetcode.twosum;


/*
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

* Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
*/

import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int secondIndex = Integer.MIN_VALUE;
        int firstIndex = Integer.MIN_VALUE;


        int[] tempArray = Arrays.copyOf(nums, nums.length);
        Arrays.sort(tempArray);

        System.out.printf("array %s ", Arrays.toString(nums));

        for (int i = 0; i < tempArray.length; i++) {

            secondIndex = Arrays.binarySearch(tempArray, target - tempArray[i]);
            if ((secondIndex >= 0) && (secondIndex != i)) {
                first = tempArray[i];
                second = tempArray[secondIndex];
                firstIndex = i;
                break;
            }

        }

        boolean isFirstFound = false;
        boolean isSecondFound = false;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] == first) && !isFirstFound) {
                firstIndex = i;
                isFirstFound = true;
                continue;
            } else if (nums[i] == second & !isSecondFound) {
                secondIndex = i;
                isSecondFound = true;
                continue;
            } else if (isFirstFound && isSecondFound) {
                break;
            }
        }
        return new int[]{firstIndex, secondIndex};
    }

}
