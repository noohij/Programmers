class Solution {
    public double solution(int[] arr) {
        double arrTotal = 0;
        double answer = 0;
        
        for(int i = 0; i < arr.length; i++){
            arrTotal += arr[i];
        }
        answer = arrTotal / arr.length;
        return answer;
    }
}