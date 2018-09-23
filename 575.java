class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> kinds = new HashSet<>();
        for (int candy : candies){
            kinds.add(candy);
        }
        if (kinds.size() > candies.length/2){
            return candies.length/2;
        }
        else {
            return kinds.size();
        }
    }
}