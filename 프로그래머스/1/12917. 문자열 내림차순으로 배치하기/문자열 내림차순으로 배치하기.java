import java.util.*;
class Solution {
    public String solution(String s) {
        char[] str = s.toCharArray();
        Arrays.sort(str);
        
        String str1 = new String(str);
		String answer = new StringBuilder(str1).reverse().toString();
        
        return answer;
    }
}