import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int result = 0;
        int[] student = new int[n + 2];
        
        for(int r : reserve) {
            student[r]++;
        }
        
        for(int l : lost) {
            student[l]--;
        }
        
        for(int i = 0; i <= n; i++) {
            if(student[i] == 1) {
                if(student[i - 1] == -1) {
                    student[i]--;
                    student[i - 1]++;
                }
                else if(student[i + 1] == -1) {
                    student[i]--;
                    student[i + 1]++;
                }
            }
        }
        
        for(int i = 1; i <= n; i++) {
            if(student[i] >= 0) {
                result++;
            }
        }
        
        return result;
    }
    
}