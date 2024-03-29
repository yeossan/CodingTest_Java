	class Solution {
  public String solution(String s) {
    String answer = "";
    int count = 0;
    
    String[] str = s.split("");
 
    for(int i=0; i<str.length; i++) {
      if((" ").equals(str[i])) count = 0;
      else {  
        if(count%2==0) {
          count++;
          str[i] = str[i].toUpperCase(); 
        }else {
          count++;
          str[i] = str[i].toLowerCase();
        }
      }
      answer += str[i];
    }
 
    return answer;
 
  }
}