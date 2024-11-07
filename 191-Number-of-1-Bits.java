class Solution {
    public int hammingWeight(int n) {
        int count=0;
        for(int bit=0;bit<31;bit++){
            if((n&(1<<bit))!=0){
                count++;
                continue;
            }
        }
        return count;
    }
}