class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> a = new Stack<>();
        int result = 0;
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("+")) {
                int lastObj = a.pop();
                int preLastObj = a.peek();
                a.push(lastObj);
                result += lastObj;
                result += preLastObj;
                a.push(lastObj+preLastObj);
            } else if (ops[i].equals("D")) {
                result += a.push(2*a.peek());
            } else if (ops[i].equals("C")) {
                result -= a.pop();
            } else {
                result += a.push(Integer.parseInt(ops[i]));
            }
            //System.out.println(result);
        }
        return result;
    }
}