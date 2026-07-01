class Solution {
    public int strStr(String haystack, String needle) {
        int idx = 0;
        int firstOccur = -1;
        for(int i=0; i<haystack.length(); i++) {
            if(haystack.charAt(i) != needle.charAt(idx) && idx != 0) {
                i = i - idx;
                idx = 0;
            }
            else if(haystack.charAt(i) != needle.charAt(idx)) {

            }
            else if(haystack.charAt(i) == needle.charAt(idx)) {
                idx++;
            }
            
            if(idx == needle.length()) {
                firstOccur = Math.abs(idx - i -1);
                break;
            }
        }

        return firstOccur;
    }
}