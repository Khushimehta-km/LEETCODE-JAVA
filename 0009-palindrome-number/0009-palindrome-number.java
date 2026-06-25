import java.util.Scanner;
class Solution {
    
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int revNo = 0;
        while (temp != 0)
        {
       
        int rem = temp % 10;
        revNo = revNo * 10 + rem;
        temp = temp / 10;
       
        }

        System.out.println("Rev no : " + revNo);
        
        //check
        if (revNo == x)
        {
            return true;
        }
        else
        {
            return false;
        }

        
    }

  


}