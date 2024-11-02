class Solution {
    public int fib(int n) {
        // if(n < 2){
        //     return n;
        // }else{
        //     return fib(n-1)+fib(n-2);
        // }
        if(n < 2){
            return n;
        }
        int[] array = new int [n+1];
        array[0]=0;
        array[1]=1;
        for (int i=2;i<array.length;i++){
            array[i]=array[i-1]+array[i-2];
        }
        return array[n];
    }
}