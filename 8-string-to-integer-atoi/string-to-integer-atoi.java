class Solution {
    public int myAtoi(String s) {
         int index = 0, total = 0, sign = 1;

    // 1. Edge case: empty string
    if (s.length() == 0) return 0;

    // 2. Remove leading spaces
    while(index < s.length() && s.charAt(index) == ' ') index++;
    if(index == s.length()) return 0;

    // 3. Handle + / -
    if(s.charAt(index) == '+' || s.charAt(index) == '-') {
        sign = s.charAt(index) == '+' ? 1 : -1;
        index++;
    }

    // 4. Convert digits
    while(index < s.length()) {
        int digit = s.charAt(index) - '0';

        // stop if not a digit
        if(digit < 0 || digit > 9) break;

        // 5. Handle overflow BEFORE multiplying by 10
        if(Integer.MAX_VALUE / 10 < total || 
          (Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit)) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        // accumulate number
        total = total * 10 + digit;
        index++;
    }

    return total * sign;
    }
}