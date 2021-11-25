class Solution7 {
    public int solution(int[] absolutes, boolean[] signs) {
        int ret = 0;
        for (int i =0; i<absolutes.length; i++){
            if(signs[i] == false){
                ret -= absolutes[i];
            }
            else
                ret += absolutes[i];
        }
        return ret;
    }
}
