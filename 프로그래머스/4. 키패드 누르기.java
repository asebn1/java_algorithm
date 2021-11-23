import java.util.Arrays;

class Solution4 {
    public int[] findIndex(char key){
        int[] answer = new int[2];
        char[][] keypad = {
                {'1','2','3'},
                {'4','5','6'},
                {'7','8','9'},
                {'*','0','#'}
        };

        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++) {
                if (keypad[i][j]==key){
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }
        return answer;
    }
    public String solution(int[] numbers, String hand) {
        int leftx=3, lefty=0;
        int rightx=3, righty=2;
        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            // 1. 왼손
            if(number == 1 || number == 4 || number == 7){
                int[] temp = findIndex(Integer.toString(number).charAt(0));
                leftx = temp[0];
                lefty = temp[1];
                sb.append("L");
            }
            // 2. 오른손
            else if(number == 3 || number == 6 || number == 9){
                int[] temp = findIndex(Integer.toString(number).charAt(0));
                rightx = temp[0];
                righty = temp[1];
                sb.append("R");
            }
            // 3. 나머지 손
            else{
                int[] temp = findIndex(Integer.toString(number).charAt(0));
                // 왼손 거리 구하기
                int leftDistance = Math.abs(temp[0]-leftx) + Math.abs(temp[1]-lefty);
                // 오른손 거리 구하기
                int rightDistance = Math.abs(temp[0]-rightx) + Math.abs(temp[1]-righty);
                if(leftDistance==rightDistance){
                    if (hand.equals("right")){
                        sb.append("R");
                        rightx = temp[0];
                        righty = temp[1];
                    }
                    else{
                        sb.append("L");
                        leftx = temp[0];
                        lefty = temp[1];
                    }
                }
                else if(leftDistance > rightDistance){
                    sb.append("R");
                    rightx = temp[0];
                    righty = temp[1];
                }
                else{
                    sb.append("L");
                    leftx = temp[0];
                    lefty = temp[1];
                }
            }
        }
        return sb.toString();
    }
}
