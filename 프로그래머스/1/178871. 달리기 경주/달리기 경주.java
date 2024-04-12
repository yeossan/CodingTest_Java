import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rankings = new HashMap<>();
        
        //순위 초기화
        for (int i = 0; i < players.length; i++) {
            rankings.put(players[i], i + 1);
        }
        
        //호출되면 순위갱신
        for (String calling : callings) {
            int index = rankings.get(calling) - 1;
            if (index > 0) {
                String temp = players[index];
                players[index] = players[index - 1];
                players[index - 1] = temp;
                
                //순위 갱신
                rankings.put(players[index], index + 1);
                rankings.put(players[index - 1], index);
            }
        } 
        return players;
    }
}
