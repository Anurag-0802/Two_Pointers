class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int pro=1, ans=0;
        int l=0, r=0;
        while(r<nums.length){
            pro*=nums[r];
            while(pro>=k && l<=r){
                pro/=nums[l];
                l++;
            }
            ans+=r-l+1;
            r++;
        }
        return ans;
    }
}