import java.util.regex.Pattern;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if (nums1.length == 0){
            return new int[0];
        }
        int[] result = new int[nums1.length];
        List<Integer> firstBag = new ArrayList<>();
        List<Integer> secondBag = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            firstBag.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            secondBag.add(nums2[i]);
        }
//        for (int i = 0; i < firstBag.size(); i++) {
//            System.out.println(firstBag.get(i));
//        }
//        for (int i = 0; i < secondBag.size(); i++) {
//            System.out.println(secondBag.get(i));
//        }
        //indexOf
        for (int i = 0; i < firstBag.size() - 1; i++) {
//            System.out.println(secondBag.indexOf(firstBag.get(i)) + 1 < secondBag.size());
            //System.out.println(firstBag.get(i) + " " + secondBag.get(secondBag.indexOf(firstBag.get(i)) + 1));
            //System.out.println(secondBag.indexOf(firstBag.get(i)) + 1);
            boolean flag = false;
            for (int j = secondBag.indexOf(firstBag.get(i)) + 1; j < secondBag.size(); j++) {
                flag = false;
                if (secondBag.indexOf(firstBag.get(i)) + 1 < secondBag.size() && firstBag.get(i) < secondBag.get(j)) {
                    //System.out.println(secondBag.get(j));
                    result[i] = secondBag.get(j);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                result[i] = -1;
            }
        }
        boolean flag = false;
        for (int j = secondBag.indexOf(firstBag.get(firstBag.size() - 1)) + 1; j < secondBag.size(); j++) {
            flag = false;
            if (secondBag.indexOf(firstBag.get(firstBag.size() - 1)) + 1 < secondBag.size() && firstBag.get(firstBag.size() - 1) < secondBag.get(j)) {
                //System.out.println(secondBag.get(j));
                result[firstBag.size() - 1] = secondBag.get(j);
                flag = true;
                break;
            }
        }
        if (!flag) {
            result[firstBag.size() - 1] = -1;
        }
        return result;
    }
}