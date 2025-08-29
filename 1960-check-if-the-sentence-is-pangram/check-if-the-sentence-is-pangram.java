class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        for(int i = 0 ; i< sentence.length();i++){
            char c = sentence.charAt(i);
            if( c >= 'a' && c <= 'z'){
                seen[c - 'a'] = true;
            }
        }

        for(boolean b : seen){
            if(!b){
                return false;
                    }}
            return true;
       
    }
}