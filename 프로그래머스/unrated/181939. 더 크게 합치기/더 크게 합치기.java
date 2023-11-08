class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aStr = "" + a;
        String bStr = "" + b;
        
        if(Integer.valueOf(aStr+bStr) >= Integer.valueOf(bStr+aStr)) {
            answer = Integer.valueOf(aStr+bStr);
        } else if(Integer.valueOf(bStr+aStr) > Integer.valueOf(aStr+bStr)) {
            answer = Integer.valueOf(bStr+aStr);
        }
        
        return answer;
    }
}