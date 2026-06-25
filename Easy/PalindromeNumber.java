// LeetCode 9 - Palindrome Number
// Date: 25 June 2026

class Solution {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int temp = x;
        int revNo = 0;

        while (temp != 0) {
            int rem = temp % 10;
            revNo = revNo * 10 + rem;
            temp = temp / 10;
        }

        return revNo == x;
    }
}
