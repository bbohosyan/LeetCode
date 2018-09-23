class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1){
            return s;
        }
        StringBuilder result = new StringBuilder();
        List<StringBuilder> rowsAndStrings = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rowsAndStrings.add(new StringBuilder());
        }
        char[] sToArray = s.toCharArray();
        int currentRow = 0;
        int plusOne = 1;
        int minusOne = -1;
        int currentDirection = plusOne;
        for (int i = 0; i < sToArray.length; i++) {
            rowsAndStrings.get(currentRow).append(sToArray[i]);
            currentRow += currentDirection;
            if (currentRow == 0) {
                currentDirection = plusOne;
            }
            if (currentRow == numRows - 1) {
                currentDirection = minusOne;
            }
        }
        for (int i = 0; i < rowsAndStrings.size(); i++){
            result.append(rowsAndStrings.get(i));
        }
        return result.toString();
    }
}