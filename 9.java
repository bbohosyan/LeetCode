class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int xNumDigits = 0;
        int copyX2 = x;
        while (true) {
            if (copyX2 == 0) {
                break;
            }
            copyX2 /= 10;
            xNumDigits++;
        }
        int copyX = x;
        int copyXNumDigits = xNumDigits;
        long someX = 0;
        int xReverse = 0;
        for (int i = 0; i < xNumDigits; i++) {
            someX += (copyX % 10) * Math.pow(10, copyXNumDigits - 1);
            xReverse += (copyX % 10) * Math.pow(10, copyXNumDigits - 1);
            copyXNumDigits--;
            copyX /= 10;
        }
        System.out.println(xReverse);
        return x == xReverse && someX == xReverse;
    }
}