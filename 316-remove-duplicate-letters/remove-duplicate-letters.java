class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        boolean [] visited = new boolean[26];
        for (int i=0;i<s.length();i++) {
            hashMap.put(s.charAt(i),i);
        }
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);

            if (visited[c-'a']) {
                continue;
            }

            while (!stack.isEmpty() && stack.peek()>c && hashMap.get(stack.peek())>i) {
                visited[stack.pop()-'a'] =false;
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
