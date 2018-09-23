class Solution {
    public String longestPalindrome(String str) {
        int maxLengthPalindrome = 0;
        if (str.length() == 0) {
            return "";
        }
        String result = "";
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j <= n; j++) {
//                //System.out.println(str.substring(i, j));
//                if (maxLengthPalindrome < (j - i) && istPalindrom(str.substring(i, j).toCharArray())) {
//                    maxLengthPalindrome = j - i;
//                    result = str.substring(i, j);
//                }
//            }
//        }
        //int aga = 1;
        int targetTimes = 1;
        for (int i = str.length(); i >= 0; i--) {
            for (int times = 0; times < targetTimes; times++) {
                //System.out.println(aga + " " + times + " " + i + " " + str.substring(times, times + i));
                //aga++;
                if (istPalindrom(str.substring(times, times + i).toCharArray())) {
                    return str.substring(times, times + i);
                }
            }
            targetTimes++;
        }
        return "";
    }
    public boolean istPalindrom(char[] word) {
        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}