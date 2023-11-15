class Solution {
    public boolean solution(int x) {
        
        String xStr = x + "";
        int xStrLength = xStr.length();
        int totCnt = 0;
        boolean answer = true;
        
        for(int i = 0; i < xStrLength; i++){
            totCnt += Integer.parseInt(xStr.substring(i, i+1));
        }
        
        if(x % totCnt != 0){
            answer = false;
        }
        
        return answer;
    }
}