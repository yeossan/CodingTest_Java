import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        
        Arrays.sort(targets, (x, y) -> x[0] - y[0]); //target sort
        int preStart = targets[0][0];
        int preEnd = targets[0][1];
        
        for(int[] target: targets) {
            if(answer == 0) {
                answer += 1;
                continue;
                
            }
            int currentStart = target[0];
            int currentEnd = target[1];
            
            if(preStart <= currentStart && currentStart < preEnd) {
            //요격 구간의 변경
            preStart = Math.max(preStart, currentStart);
            preEnd = Math.min(preEnd, currentEnd);
        }
        else {
            preStart = currentStart;
            preEnd = currentEnd;
            answer += 1;
        }
    }
        return answer;
    }
}