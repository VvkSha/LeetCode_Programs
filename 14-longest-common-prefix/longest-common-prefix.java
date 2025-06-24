class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        String firstStr = strs[0];
        String lastStr = strs[strs.length-1];
        int minLength = Math.min(firstStr.length(), lastStr.length());
        int i = 0;
        while(i<minLength && firstStr.charAt(i) == lastStr.charAt(i)){
                  i++;
        }

        return firstStr.substring(0,i);
    }
}