/*
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
  
*/

class Solution {
    public boolean isPalindrome(int x) {
        String original = Integer.toString(x);
        StringBuilder reverse = new StringBuilder();
        for (int i = original.length() - 1; i > -1; i -- ){
            reverse.append(original.charAt(i));
            //System.out.println(reverse);
        }
        String reversedString = reverse.toString();
        if (original.equals(reversedString)) {
            return true;
        }
        return false;
    }
}
