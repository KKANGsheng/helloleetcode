class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    int [] result = new int[temperatures.length];
    Stack<Integer> stack = new Stack<>();

    for (int i=0;i<temperatures.length;i++) {
        while(!stack.isEmpty()&& temperatures[stack.peek()]<temperatures[i]) {
            int temp = stack.pop();
            result[temp] = i- temp;
        }
        stack.push(i);
    }
    return result;
  }
}