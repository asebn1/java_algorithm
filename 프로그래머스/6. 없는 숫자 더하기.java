import com.sun.jdi.Value;

import java.util.Arrays;

class Solution6 {
    public int solution(int[] numbers) {
        int ret = 0;
        for (int i=1; i<10; i++){
            int checkId = i;
            if(!Arrays.stream(numbers).anyMatch(key -> key==checkId)){
                ret += checkId;
            }
        }

        return ret;
    }
}

