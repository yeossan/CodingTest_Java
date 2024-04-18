class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        int returnCoke = 0;
        int returnBottle = 0;
        for(int i = 0; i < n; i++) { 
            while(n >= a) { 
                returnBottle = n % a; 
                returnCoke = (n / a) * b; 
            
                n = returnCoke;
                answer += n; 
                n += returnBottle; 
            }
            if(n < a) {
                continue;
            }
        } 
        return answer;
    }
}