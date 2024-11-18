class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] answer = new int[n]; 
        if (k == 0) {
            return answer;
        }
        int[] sum = new int[n * 2 + 1];
        for (int i = 0; i < n * 2; ++i) {
            sum[i + 1] = sum[i] + code[i % n];
        }
        for (int i = 0; i < n; ++i) {
            if (k > 0) {
                answer[i] = sum[i + k + 1] - sum[i + 1];
            } else {
                answer[i] = sum[i + n] - sum[i + k + n];
            }
        }
        return answer;
    }
}