import java.util.Arrays;

class Solution {
    public int[] solution(int n, int m) {
        
        int answer1 = 0;
        int answer2 = 0;
                
        int[] givenArr = {n, m};
        Arrays.sort(givenArr);
        
        for(int i = n; i >= 1; i--){
            if(n % i == 0 && m % i ==0){
                answer1 = i;
                break;
            }
        }
        for(int j = m; j <= n * m; j++){
            if(j % m == 0 && j % n == 0){
                answer2 = j;
                break;
            }
        }
        
        int[] answer = {answer1, answer2};
        
        return answer;
    }
}