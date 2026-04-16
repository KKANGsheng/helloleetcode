class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int [] result = new int[n];
        Stack<Integer> stack= new Stack<>();

        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){
                int pop = stack.pop();
                result[pop]= i-pop;
            }
            stack.push(i);
        }
        return result;
    }
}