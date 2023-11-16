class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        String regEx = "^[0-9]*$";
        
        if((s.length() == 4 || s.length() == 6) && s.matches(regEx)){
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}