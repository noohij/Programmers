class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] intArr = new int[absolutes.length];
        
        for(int i = 0; i < absolutes.length; i++){
            if(signs[i]){
                intArr[i] = absolutes[i];
            } else{
                intArr[i] = -absolutes[i];
            }
        }
        
        for(int j = 0; j < intArr.length; j++){
            answer += intArr[j];
        }
    
        return answer;
    }
}