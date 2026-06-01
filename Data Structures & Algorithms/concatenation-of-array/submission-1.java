class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] ans=new int[2*nums.length];
        int id=0;
        for(int i=0;i<nums.length;i++){
            ans[i+nums.length]=ans[i]=nums[i];

            // for(int num:nums){
            //     ans[id++]=num;
            // }
        }
        return ans;
        
    }
}