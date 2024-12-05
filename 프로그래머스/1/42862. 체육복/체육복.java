import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int result = 0;
        //set 생성
        HashSet<Integer> reSet = new HashSet<>();
        HashSet<Integer> lSet = new HashSet<>();
        
        for(int i : reserve) {
            reSet.add(i);
        }
        
        for(int i : lost) {
            if(reSet.contains(i)) {
                reSet.remove(i); //자기꺼만 보유
            }
            else {
                lSet.add(i);
            }
        }
        
        //reserve 기준 앞뒤로 확인 후 빌려주기
        for(int i : reSet) {
             if(lSet.contains(i - 1)) {
                 lSet.remove(i - 1);
             }
            else if(lSet.contains(i + 1)) {
                lSet.remove(i + 1);
            }
        }
        
        //전체 - lSet
        return n - lSet.size();
    }
    
}