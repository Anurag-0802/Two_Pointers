class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int[] answer= new int[n];
        int ei=0;
        int oi=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                answer[ei]=nums[i];
                ei+=2;
            }
            else {
                answer[oi]=nums[i];
                oi+=2;
            }    
        }
        return answer;
    }
}