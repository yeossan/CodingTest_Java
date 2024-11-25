class Solution {
    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int count = 0;
        
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        
        String targetColor = board[h][w];
        
        for(int i = 0; i < 4; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];
            
            if (h_check >= 0 && w_check >= 0 && h_check < n && w_check < n 
                && targetColor.equals(board[h_check][w_check])) {
                count++;
            }
        }
        
        return count;
    }
}