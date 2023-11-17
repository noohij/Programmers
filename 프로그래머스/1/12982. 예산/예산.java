import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int totReq = 0;
        
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++){
            totReq += d[i];
            if(totReq > budget){
                answer = i;
                break;
            }
        }
        if(d[0] <= budget && answer == 0){
            answer = d.length;
        }
        
        return answer;
    }
}