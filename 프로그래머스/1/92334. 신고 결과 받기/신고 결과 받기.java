import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length]; // 메일을 받은 횟수
        Map<String, Integer> idMap = new HashMap<>(); // 유저 순서 저장
        Map<String, Set<String>> map = new HashMap<>(); // 각 유저별 자신을 신고한 유저 set

        
        Arrays.stream(id_list)
              .forEach(id -> {
                  idMap.put(id, idMap.size());
                  map.put(id, new HashSet<>());
              });

        // 자신을 신고한 유저이름 저장
        Arrays.stream(report)
              .map(r -> r.split(" "))
              .forEach(str -> map.get(str[1]).add(str[0]));

        // 유저별 신고당한 횟수가 k보다 많으면 메일보냄
        Arrays.stream(id_list)
              .forEach(id -> {
                  Set<String> set = map.get(id); // 해당 유저를 신고한 유저 set
                  if (set.size() >= k) {
                      set.forEach(userId -> answer[idMap.get(userId)]++);
                  }
              });

        return answer;
    }
}
