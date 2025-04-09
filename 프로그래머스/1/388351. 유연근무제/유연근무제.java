class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for (int i = 0; i < schedules.length; i++) {
            int[] timelog = timelogs[i];
            int schedule = schedules[i] + 10;

            // 시간 보정 로직 (60분 이상인 경우 시간 조정)
            if (schedule % 100 >= 60) {
                int h = (schedule / 100) + 1;
                int m = (schedule % 100) - 60;
                schedule = (h * 100) + m;
            }

            int day = startday;

            for (int t : timelog) {
                if (day % 7 == 0 || day % 7 == 6) {
                    day++;
                    continue;
                }

                if (t > schedule) {
                    break;
                }

                day++;
            }

            if (day == startday + 7) {
                answer++;
            }
        }

        return answer;
    }
}
