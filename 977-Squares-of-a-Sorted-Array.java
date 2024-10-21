class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        for(int i =0; i<n;i++){
            res[i] = (int)Math.pow(nums[i],2);
        }
        Arrays.sort(res);
        return res;
    }
}