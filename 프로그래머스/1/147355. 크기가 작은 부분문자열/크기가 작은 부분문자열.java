import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = t.length() - p.length() + 1;
        long n = Long.parseLong(p);
        
        for(int i = 0; i < length; i++) {
            String test = t.substring(i, i + p.length());
            Long n1 = Long.parseLong(test);
            
            if(n1 <= n)
                answer++;
        }
        return answer;
    }
}