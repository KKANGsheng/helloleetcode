class Solution {
    public boolean isPalindrome(int x) {
    String y=Integer.toString(x);
        
    int front=0;
    int back=y.length()-1;
    
    while(front<=back){
        if(y.charAt(front)!=y.charAt(back)){
            return false;
        }
        front++;
        back--;
    }
        return true;
    }
}