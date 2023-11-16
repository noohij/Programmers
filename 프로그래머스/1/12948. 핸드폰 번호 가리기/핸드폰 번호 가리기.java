class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int pnLength = phone_number.length();
        String[] pnStr = new String[pnLength];
        
        for(int i = 0; i < pnLength; i++){
            pnStr[i] = phone_number.substring(i, i+1);
        }
        for(int j = 0; j < pnLength - 4; j++){
            answer += "*";
        }
        for(int k = pnLength-4; k < pnLength; k++){
            answer += pnStr[k];
        }
        return answer;
    }
}