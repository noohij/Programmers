import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int answer = 0;
        int sidesSum = sides[0] + sides[1];
        
        // 나머지 한 변이 가장 크거나 sides[1]과 같은 경우
        for(int i = 0; i < (sidesSum - sides[1]); i++){
            answer++;
        }
        // sides[1]이 가장 큰 경우
        for(int j = 0; j < (sides[1] - (sides[1] - sides[0]) - 1); j++){
            answer++;
        }
        
        return answer;
    }
}