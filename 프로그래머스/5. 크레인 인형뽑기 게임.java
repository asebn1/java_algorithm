import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution5 {
    public int solution(int[][] board, int[] moves) {
        ArrayList<Integer> stack = new ArrayList<>();
        int length = board.length; // 깊이
        int count =0;
        for (int move : moves) {
            for(int i=0; i<length; i++){
                if (board[i][move-1] != 0){
                    int checkNum = board[i][move-1];
                    board[i][move-1] = 0;
                    if (stack.size()==0)
                        stack.add(checkNum);
                    else if(stack.size()>0 && stack.get(stack.size()-1) != checkNum)
                        stack.add(checkNum);
                    else{
                        count += 1;
                        stack.remove(stack.size()-1);
                    }
                    break;
                }
            }
        }
        return count*2;
    }
}
