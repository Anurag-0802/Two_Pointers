class Solution {
    public boolean isPowerOfTwo(int n) {
        // for(int i=0;i<31;i++){
        //     if(Math.pow(2,i)==n){
        //         return true;
        //     }
        // }
        // return false;
        if(n<=0) return false;
        if(n==1) return true;
        return (n%2==0)&&isPowerOfTwo(n/2);//this isPowerOfTwo(n/2) is
        // performing recursion by dividing n by2 to check whether it is power of two or not.
    }
}