import java.util.Scanner;
class Solution {
    
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int revNo = 0;
        while (x != 0)
        {
       
        int rem = x % 10;
        revNo = revNo * 10 + rem;
        x = x / 10;
       
        }
        
        //check
        if (revNo == temp)
        {
            return true;
        }
        else
        {
            return false;
        }

        
    }

  


}