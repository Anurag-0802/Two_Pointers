class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // approach1
        // for(int i = 0; i < numbers.length-1;i++){
        //     for(int j = i+1; j < numbers.length; j++){
        //         if(numbers[i]+numbers[j]==target){
        //             int[] a = {i+1, j+1};
        //             return a;
        //         }
        //     }
        // }
        // return null;
        // approach 2
        int n=numbers.length;
        int l=0;
        int r=n-1;
        while(l<r){
            if(numbers[l]+numbers[r]==target) break;
            else if(numbers[l]+numbers[r]>target) r--;
            else l++;
        }
        return new int[] {l+1,r+1};

    }
}