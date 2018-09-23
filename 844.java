class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> characters = new Stack<>();
        char[] sChar = S.toCharArray();
        for (int i = 0; i < sChar.length; i++){
            if (sChar[i] == '#') {
                if (!characters.empty()){
                    characters.pop();
                }
            }
            else {
                characters.push(sChar[i]);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char character : characters){
            stringBuilder.append(character);
        }
        //System.out.println(stringBuilder);

        Stack<Character> charactersT = new Stack<>();
        char[] tChar = T.toCharArray();
        for (int i = 0; i < tChar.length; i++){
            if (tChar[i] == '#') {
                if (!charactersT.empty()){
                    charactersT.pop();
                }
            }
            else {
                charactersT.push(tChar[i]);
            }
        }
        StringBuilder stringBuilderT = new StringBuilder();
        for (char character : charactersT){
            stringBuilderT.append(character);
        }
        //System.out.println(stringBuilderT);
        if (stringBuilder.toString().equals(stringBuilderT.toString())){
            return true;
        }
        else {
            return false;
        }
    }
}