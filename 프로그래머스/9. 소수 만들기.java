import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution9 {
    int[] baseNums;
    Stack<Integer> s = new Stack<>();
    int ret = 0;

    // 조합
    public void dfs(int start) {
        if (s.size() == 3) {
            int sum = 0;
            for (Integer integer : s) {
                sum += integer;
            }
            ret += checkIsPrime(sum) ? 1 : 0;
            return;
        }
        for (int i = start; i < baseNums.length; i++) {
            s.push(baseNums[i]);
            dfs(i + 1);
            s.pop();
        }
    }

    // 소수 판별
    public boolean checkIsPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i < ((int) Math.sqrt(num) + 1); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public int solution(int[] nums) {
        // 클래스변수로
        baseNums = nums;
        // 조합 구하기
        dfs(0);
        return ret;
    }
}