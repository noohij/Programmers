import java.lang.Integer;

class Solution {
    public String solution(String s) {
        
        String[] sArr = s.split(" ");
        String answerMin = sArr[0];
        String answerMax = sArr[0];
        
        for(int i = 0; i < sArr.length - 1; i++){
            if(Integer.parseInt(answerMin) < Integer.parseInt(sArr[i+1])){
                answerMin = sArr[i+1];
            }
            if(Integer.parseInt(answerMax) > Integer.parseInt(sArr[i+1])){
                answerMax = sArr[i+1];
            }
        }
        
        String answer = answerMax + " " + answerMin;
        return answer;
    }
}