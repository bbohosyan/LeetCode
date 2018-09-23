class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> result = new Stack<>();
        result.add(asteroids[0]);
        for (int i = 1; i < asteroids.length; i++) {
            result.add(asteroids[i]);
            while (true) {
                if (result.size() < 2) {
                    break;
                } else {
                    int lastElement = result.pop();
                    int beforeLastElement = result.pop();
                    if (lastElement < 0 && beforeLastElement > 0) {
                        if (Math.abs(lastElement) > beforeLastElement) {
                            result.add(lastElement);
                        } else if (Math.abs(lastElement) < beforeLastElement) {
                            result.add(beforeLastElement);
                        }
                    } else {
                        result.add(beforeLastElement);
                        result.add(lastElement);
                        break;
                    }
                }
            }
        }
        int[] resultF = new int[result.size()];
        for (int j = result.size() - 1; j >= 0; j--) {
            resultF[j] = result.pop();
        }
        return resultF;
    }
}