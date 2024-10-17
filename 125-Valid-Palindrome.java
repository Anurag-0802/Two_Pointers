class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll(\[^a-zA-Z0-9]\, \\);
        s = s.toLowerCase();
        
        int p2=s.length()-1;
        int i=0;
        for(i=0;i<s.length()/2;++i){
            if(s.charAt(i)==s.charAt(p2)){
                p2--;
                continue;
            }
            else return false;
        }
        return true;

        
    }
}