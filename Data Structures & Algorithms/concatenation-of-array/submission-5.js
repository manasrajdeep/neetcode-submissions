class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    getConcatenation(nums) {
        if (nums.length<1) return [];
        let ans = [...nums,...nums];
        return ans
    }
}
