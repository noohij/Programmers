class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        double totLength = 0;
           
        for(int i = 0; i < sides.length; i++) {
            totLength += sides[i];
        }
        
        if(sides[0] < totLength/2 && sides[1] < totLength/2 && sides[2] < totLength/2) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}