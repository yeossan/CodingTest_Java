import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int winCount = 0;
        int zeroCount = 0;
        
        // lottos와 win_nums를 비교하여 당첨 번호 개수와 0의 개수를 카운트
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    winCount++;
                    break;
                }
            }
        }
        
        // 최고 순위와 최저 순위 계산
        int maxRank = calculateRank(winCount + zeroCount);
        int minRank = calculateRank(winCount);
        
        answer[0] = maxRank;
        answer[1] = minRank;
        
        return answer;
    }
    
    private int calculateRank(int count) {
        switch (count) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}
