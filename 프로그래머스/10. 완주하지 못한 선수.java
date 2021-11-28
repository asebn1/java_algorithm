import java.util.Arrays;
import java.util.stream.Stream;

class Solution10 {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0; i< completion.length; i++){
            if (!completion[i].equals(participant[i]))
                return participant[i];
        }
        return participant[participant.length-1];
    }
}
