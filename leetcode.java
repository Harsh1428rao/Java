//Find First and Last Position of Element in Sorted Array
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        
        int start = findStartingPosition(nums, target);
        if (start == -1) {
            return result;
        }
        
        
        int end = findEndingPosition(nums, target);
        
        return new int[]{start, end};
    }
    
    private int findStartingPosition(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (nums[mid] == target) {
                result = mid;
            }
        }

        return result;
    }
    
    private int findEndingPosition(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if (nums[mid] == target) {
                result = mid;
            }
        }

        return result;
    }
}
