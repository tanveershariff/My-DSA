class Solution {
    public boolean isPalindrome(String s) {
        int r = s.length() - 1;
        int l = 0;
        while (l < r) {
            char left = s.charAt(l);
            char right = s.charAt(r);
            if (!Character.isLetterOrDigit(left)) {
                l++;
            }
            else if (!Character.isLetterOrDigit(right)) {
                r--;
            } 
            else {
                if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                    return false;
                }
                r--;
                l++;

            }
        }
        return true;
    }
    // private boolean Character.isLetterOrDigit(char c) {
    //     return (c>='a' && c<='z') ||  (c>='A' && c<='Z') || (c>='0' && c<='9'); 
    //     }
}