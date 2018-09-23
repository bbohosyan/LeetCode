class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;
        boolean isFinished = false;
        for(i = 0; i < nums.length - 1; i++){
            for (j = i + 1;j < nums.length; j++){
                isFinished = false;
                if (nums[i] + nums[j] == target){
                    isFinished = true;
                    break;
                }
            }
            if(isFinished){
                break;
            }
        }
        return new int[]{i,j};
    }
}