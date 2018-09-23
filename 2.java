import java.math.BigInteger;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //System.out.println(l1.val + " " + l1.next.val + " " + l1.next.next.val);
        BigInteger num1 = BigInteger.ZERO;
        BigInteger coef = BigInteger.ONE;
        //num1 += l1.val;
        while (true){
            //System.out.println(num1);
            if (l1.next != null){
                num1 = num1.add(/*l1.val*coef*/coef.multiply(BigInteger.valueOf(l1.val)));
                l1 = l1.next;
                coef = coef.multiply(BigInteger.valueOf(10));
            }
            else {
                num1 = num1.add(coef.multiply(BigInteger.valueOf(l1.val)));
                break;
            }
        }
        //System.out.println(num1);
        BigInteger num2 = BigInteger.ZERO;
        //num2 += l2.val;
        coef = BigInteger.ONE;
        while (true){
            if (l2.next != null){
                num2 = num2.add(coef.multiply(BigInteger.valueOf(l2.val)));
                l2 = l2.next;
                coef = coef.multiply(BigInteger.valueOf(10));
            }
            else {
                num2 = num2.add(coef.multiply(BigInteger.valueOf(l2.val)));
                break;
            }
        }
        BigInteger resultInt = BigInteger.ZERO;
        resultInt = resultInt.add(num1);
        resultInt = resultInt.add(num2);
        System.out.println(num1);
        //System.out.println(1999999999);
        long lengthResultInt = String.valueOf(resultInt).length();
        long lengthResult = 0;
        List<ListNode> list = new ArrayList<>();
        while (true){
            //System.out.println(resultInt);
            System.out.println(resultInt);
            BigInteger a = resultInt.remainder(BigInteger.valueOf(10L));
            System.out.println(a);
            long b = a.longValue();
            list.add(new ListNode((int)b));
            resultInt = resultInt.divide(BigInteger.valueOf(10));
            lengthResult++;
            if (lengthResult == lengthResultInt){
                break;
            }
        }
        //System.out.println(list.get(0).val + " " + list.get(1).val + " " + list.get(2).val);
        for (int i = 0; i < list.size() - 1; i++){
            list.get(i).next = list.get(i+1);
        }
        System.out.println(list.size());
        return list.get(0);
    }
}