import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
                       
        for(int i = 0; i < sizes.length; i++){
            Arrays.sort(sizes[i]);
        }   
        
        int answer = 0;
        int maxW = sizes[0][0];
        int maxH = sizes[0][1];
        
        for(int j = 1; j < sizes.length; j++){
            if(sizes[j][0] > maxW){
                maxW = sizes[j][0];
            }
        }
        
        for(int k = 1; k < sizes.length; k++){
            if(sizes[k][1] > maxH){
                maxH = sizes[k][1];
            }
        }
        
        answer = maxW * maxH;
        
        return answer;
    }
}