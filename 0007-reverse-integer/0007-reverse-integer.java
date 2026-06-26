class Solution {
    public int reverse(int x) {
        int revNo = 0;
        while (x != 0)
        {
            int rem = x % 10;
            if (revNo > Integer.MAX_VALUE / 10 ||
               (revNo == Integer.MAX_VALUE / 10 && rem > 7))
                return 0;

            if (revNo < Integer.MIN_VALUE / 10 ||
               (revNo == Integer.MIN_VALUE / 10 && rem < -8))
                return 0;


            revNo = (revNo * 10) + rem;
            x = x/10;
        }
       
        return revNo;
        }
    }
