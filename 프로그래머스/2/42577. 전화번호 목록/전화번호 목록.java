import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        
        boolean answer = true;
        int length = phone_book.length;
        Arrays.sort(phone_book);
        
        for(int i = 0; i < length - 1; i++) {
            if(phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
        
        return true;
    }
}