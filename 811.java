class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> resultMap = new HashMap<>();
        for (String cpdomain : cpdomains){
            String[] cpdomainSplit = cpdomain.split(" ");
            int valueCpdomain = Integer.parseInt(cpdomainSplit[0]);
            String[] cpdomainSplitByDot = cpdomainSplit[1].split("\\.");
            if (cpdomainSplitByDot.length == 2){
                String firstDomain = cpdomainSplit[1];
                String secondDomain = cpdomainSplitByDot[1];
                if (resultMap.containsKey(firstDomain)){
                    int currentValueOfCurrentKey = resultMap.get(firstDomain);
                    resultMap.put(firstDomain, currentValueOfCurrentKey + valueCpdomain);
                }
                else {
                    resultMap.put(firstDomain, valueCpdomain);
                }
                if (resultMap.containsKey(secondDomain)){
                    int currentValueOfCurrentKey = resultMap.get(secondDomain);
                    resultMap.put(secondDomain, currentValueOfCurrentKey + valueCpdomain);
                }
                else {
                    resultMap.put(secondDomain, valueCpdomain);
                }
            }
            else {
                String firstDomain = cpdomainSplit[1];
                //System.out.println(cpdomainSplit[1]);
                //System.out.println(cpdomainSplit[1].split("\\.").length);
//                for (int i = 0; i < cpdomainSplitByDot.length; i++){
//                    System.out.println("p: " + cpdomainSplitByDot[i]);
//                }
                String secondDomain = cpdomainSplitByDot[1] + "." + cpdomainSplitByDot[2];
                String thirdDomain = cpdomainSplitByDot[2];
                if (resultMap.containsKey(firstDomain)){
                    int currentValueOfCurrentKey = resultMap.get(firstDomain);
                    resultMap.put(firstDomain, currentValueOfCurrentKey + valueCpdomain);
                }
                else {
                    resultMap.put(firstDomain, valueCpdomain);
                }
                if (resultMap.containsKey(secondDomain)){
                    int currentValueOfCurrentKey = resultMap.get(secondDomain);
                    resultMap.put(secondDomain, currentValueOfCurrentKey + valueCpdomain);
                }
                else {
                    resultMap.put(secondDomain, valueCpdomain);
                }if (resultMap.containsKey(thirdDomain)){
                    int currentValueOfCurrentKey = resultMap.get(thirdDomain);
                    resultMap.put(thirdDomain, currentValueOfCurrentKey + valueCpdomain);
                }
                else {
                    resultMap.put(thirdDomain, valueCpdomain);
                }

            }
        }
        for(Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            result.add(value + " " + key);
            // do what you have to do here
            // In your case, another loop.
        }

        return result;
    }
}