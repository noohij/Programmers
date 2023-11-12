import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer;
        
        int bLength = before.length();
        int aLength = after.length();
        String[] bStr = new String[bLength];
        String[] aStr = new String[aLength];
        
        for(int i = 0; i < bLength; i++){
            bStr[i] = before.charAt(i) + "";
        }
        for(int j = 0; j < aLength; j++){
            aStr[j] = after.charAt(j) + "";
        }
        Arrays.sort(bStr);
        Arrays.sort(aStr);
        
        int cnt = 0;
        for(int k = 0; k < bLength; k++) {    
            if(bStr[k].equals(aStr[k])){
                cnt++;
            }
        }
        if(cnt == bLength){
            answer = 1;
        } else {
            answer = 0;
        }
            
        return answer;
    }
}