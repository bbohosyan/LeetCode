class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> jewels = new HashSet<>();
        int counter = 0;
        for (char jewel : J.toCharArray()){
            jewels.add(jewel);
        }
        for (char stone : S.toCharArray()){
            if (jewels.contains(stone)){
                counter++;
            }
        }
        String a = "aa";
        a.length()
        return counter;
    }
}