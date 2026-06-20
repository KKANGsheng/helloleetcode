class Solution {
    public String removeDuplicateLetters(String s) {
        Map<Character,Integer> lastIndex = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        boolean[] visited = new boolean[26];
        StringBuilder sb = new StringBuilder();

        for (int i=0;i<s.length();i++) {
            lastIndex.put(s.charAt(i),i);
        }

        for (int i=0;i<s.length();i++) {
            char c= s.charAt(i);
            if(visited[c-'a']) {
                continue;
            }
            while (!stack.isEmpty()
            && stack.peek()>c 
            && lastIndex.get(stack.peek())>i) {
                visited[stack.pop()-'a']=false;
            }
            stack.push(c);
            visited[c-'a']=true;
        }

        for (char c:stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
