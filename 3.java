class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> allCharacters = new HashSet<>();
        char[] sArray = s.toCharArray();
        int maxLength = 0;
        int currentLength = 0;
        for (int startingPosition = 0; startingPosition < s.length(); startingPosition++){
            for (int j = startingPosition; j < s.length(); j++){
                if (allCharacters.contains(sArray[j])){
                    break;
                }
                else {
                    allCharacters.add(sArray[j]);
                    currentLength++;
                }
            }
            if (currentLength > maxLength){
                maxLength = currentLength;
            }
            currentLength = 0;
            allCharacters = new HashSet<>();
        }
        return maxLength;
    }
}