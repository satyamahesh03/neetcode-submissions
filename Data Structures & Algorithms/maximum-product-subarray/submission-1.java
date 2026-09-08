class Solution {
    public int maxProduct(int[] nums) {
        int maxVal = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];

        for(int i=1; i<nums.length; i++){
            int num = nums[i];

            int tempMax = Math.max(num, Math.max(currMax*num, currMin*num));
            currMin = Math.min(num, Math.min(currMax*num, currMin*num));
            currMax = tempMax;
            maxVal= Math.max(maxVal, currMax);
        }

        return maxVal;
    }
}
