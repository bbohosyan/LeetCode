class Solution {
    public static int myAtoi(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        str = str.trim();
        if (str.length() == 0){
            return 0;
        }
        if ((str.charAt(0) < '0' || str.charAt(0) > '9') && !(str.charAt(0) == '-') && !(str.charAt(0) == '+')){
            return 0;
        }
        else {
            stringBuilder.append(str.charAt(0));
        }
        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i) < '0' || str.charAt(i) > '9'){
                break;
            }
            else {
                stringBuilder.append(str.charAt(i));
            }
        }
        if (stringBuilder.length() == 1 && (str.charAt(0) == '-' || str.charAt(0) == '+')){
            return 0;
        }
        try {
            Double a = Double.parseDouble(stringBuilder.toString().split(" ")[0]);
            return a.intValue();
        }
        catch (Exception e){
            return Integer.MIN_VALUE;
        }
    }
}