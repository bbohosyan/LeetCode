class Solution {
    public int reverse(int x) {
        if (x < 0){
            x = Math.abs(x);
            try {
                return Integer.parseInt("-" + new StringBuilder(String.valueOf(x)).reverse().toString());

            }
            catch (Exception e){
                return 0;
            }
        }
        else {
            try {
                return Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());

            }
            catch (Exception e){
                return 0;
            }
        }

    }
}