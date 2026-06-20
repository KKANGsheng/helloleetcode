class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char c:s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek()==(c)) {
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        
        for (char a:stack) {
            sb.append(a);
        }

        return sb.toString();
    }
}