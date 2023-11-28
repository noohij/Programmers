import java.util.*;

public class Solution {
    public int solution(int n) {
        
        int answer = 0;
        String nStr = Integer.toString(n);
        String[] nArr = new String[nStr.length()];
        
        for(int i = 0; i < nStr.length(); i++){
            nArr[i] = String.valueOf(nStr.charAt(i));
            answer += Integer.valueOf(nArr[i]);
        }

        return answer;
    }
}