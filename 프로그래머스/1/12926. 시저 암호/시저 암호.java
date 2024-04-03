class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        int num = 0;
        for(int i = 0; i < s.length(); i++) {
            num = s.charAt(i) + n; //아스키코드 수만큼 shift
            
            if(s.charAt(i) == ' ') { //공백
                answer += s.charAt(i);
            }
            
            //쪼갠 문자가 z의 아스키코드 숫자 && Z의 아스키코드 숫자를 초과할 경우
            else if(s.charAt(i) < 91 && num > 90 || num > 122) {
                num -= 26;
                answer += (char)num;
            }
            else {
                answer += (char)num;
            }
        }
        return answer;
    }
}