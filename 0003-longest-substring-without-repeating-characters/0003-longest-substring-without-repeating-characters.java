class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (map.get(c) > 1) {
                char a = s.charAt(l);
                map.put(a, map.get(a) - 1);
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }

}