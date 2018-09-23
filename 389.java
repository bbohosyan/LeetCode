class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        for (int i = 0; i < sChar.length; i++){
            if (sMap.containsKey(sChar[i])){
                int value = sMap.get(sChar[i]);
                sMap.remove(sChar[i]);
                sMap.put(sChar[i], value+1);
            }
            else {
                sMap.put(sChar[i], 1);
            }
        }
        for (int i = 0; i < tChar.length; i++){
            if (tMap.containsKey(tChar[i])){
                int value = tMap.get(tChar[i]);
                tMap.remove(tChar[i]);
                tMap.put(tChar[i], value+1);
            }
            else {
                tMap.put(tChar[i], 1);
            }
        }
//        System.out.println(sMap.size());
//        System.out.println(tMap.size());
//        for(Map.Entry<Character, Integer> entry : tMap.entrySet()) {
//            Character key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println(key + " " + value);
//        }
//        for(Map.Entry<Character, Integer> entry : sMap.entrySet()) {
//            Character key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println(key + " " + value);
//        }
        for(Map.Entry<Character, Integer> entry : tMap.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            //System.out.println(1);
            if (!sMap.containsKey(key)){
                return key;
            }
            else {
                if (!sMap.get(key).equals(value)){
                    return key;
                }
            }
            // do what you have to do here
            // In your case, another loop.
        }
        return 'a';
    }
}