import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution11 {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        for (int[] command : commands) {
            int start = command[0], end = command[1], d = command[2];
            int[] temp = Arrays.copyOfRange(array, start - 1, end);
            Arrays.sort(temp);
            answer.add(temp[d - 1]);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

//class main {
//    public static void main(String[] args) {
//        Solution11 s = new Solution11();
//        System.out.println(s.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}));
//    }
//}