class Solution {
    public String longestPalindrome(String s) {
        
        int maxlen = Integer.MIN_VALUE;
        int start = 0;
        int len = s.length();
        for(int i=0; i<len; i++){
            for(int j=i; j<len; j++){
                if(checkPal(s,i,j) && (j-i+1)>maxlen){
                    maxlen = j-i+1;
                    start = i;
                }
            }
        }

        return s.substring(start,start+maxlen);
    }

    public boolean checkPal(String s, int start, int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}