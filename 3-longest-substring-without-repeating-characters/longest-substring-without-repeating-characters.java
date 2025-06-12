class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       //using hashmap
       HashMap<Character, Integer> map = new HashMap<>();
       int start = 0;
       int maxlen = Integer.MIN_VALUE;
       for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);
        if(map.containsKey(ch)){
            start = Math.max(start, map.get(ch)+1);
        }
        map.put(ch, i);
        maxlen = Math.max(maxlen, i - start +1);
       }
       return maxlen == Integer.MIN_VALUE ? 0 : maxlen;

    }
}