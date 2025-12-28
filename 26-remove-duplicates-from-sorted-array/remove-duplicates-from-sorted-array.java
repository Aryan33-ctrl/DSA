class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
        
        
         return 0;

        int uniqueIndex = 0; // points to the last unique element found

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i]; // move the new unique element forward
            }
        }

        // number of unique elements = index + 1
        return uniqueIndex + 1;
    }
}
