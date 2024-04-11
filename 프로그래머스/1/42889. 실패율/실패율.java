import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer;
        int[] failCount = new int[N + 1]; // 스테이지별 실패자 수 배열

        // 스테이지별 실패자 수 계산
        for (int stage : stages) {
            if (stage <= N) {
                failCount[stage]++;
            }
        }

        // 스테이지별 실패율 계산
        Map<Integer, Double> failureRates = new HashMap<>();
        int totalPlayers = stages.length;
        for (int i = 1; i <= N; i++) {
            if (totalPlayers == 0) {
                failureRates.put(i, 0.0);
            } else {
                failureRates.put(i, (double) failCount[i] / totalPlayers);
                totalPlayers -= failCount[i];
            }
        }

        // 실패율을 기준으로 내림차순 정렬
        List<Integer> sortedStages = new ArrayList<>(failureRates.keySet());
        sortedStages.sort((s1, s2) -> Double.compare(failureRates.get(s2), failureRates.get(s1)));

        // 정렬된 스테이지를 배열에 저장
        answer = sortedStages.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
