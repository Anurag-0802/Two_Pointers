class Solution {
    public boolean isCircularSentence(String sentence) {
        // if(sentence.charAt(0)!=sentence.charAt(sentence.length()-1)){
        //     return false;
        // }
        // String[] words = sentence.split(" ");
        // for (int i = 0; i < words.length - 1; i++) {
        //     if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
        //         return false;
        //     }
        // }
        // return true;
        if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1))
            return false;

        int k = sentence.indexOf(" ");
        if (k == -1)
            return true;

        while (k != -1) {
            if (sentence.charAt(k - 1) != sentence.charAt(k + 1)) {
                return false;
            }

            k = sentence.indexOf(" ", k+1);
        }
        return true;
    }
}