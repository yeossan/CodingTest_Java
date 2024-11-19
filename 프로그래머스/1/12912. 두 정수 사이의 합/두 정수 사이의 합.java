class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int start = 0;
        int end = 0;
        
        if(a > b) {
            end = a;
            start = b;
        }
        else if(a < b) {
            start = a;
            end = b;
        }
        else
            return a;
        
        for(int i = start; i <= end; i++) {
            answer += i;
        }
        
        
        return answer;
    }
}