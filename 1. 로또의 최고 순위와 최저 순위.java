import java.util.Arrays;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count0 = 0;
        int rightCount = 0;

        // lottos 비교
        for (int lotto : lottos) {
            if(lotto==0)
                count0 += 1;
            else{
                if(Arrays.stream(win_nums).anyMatch(i -> i==lotto))
                    rightCount += 1;
            }
        }
        answer[1] = rightCount >= 2 ? 7 - rightCount : 6;
        answer[0] = answer[1] - count0 < 1 ? 1 : answer[1] - count0;
        return answer;
    }
}