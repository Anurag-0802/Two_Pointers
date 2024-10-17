class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int c=0;
        int i =0;
        for(int j=0;j<s.length&&i<g.length;j++){
            if(g[i]<=s[j]){
                c++;
                i++;
            }
        }
        return c;
    }
}