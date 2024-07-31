class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int strLength = str1.length();
        
        String[] str1Arr = new String[strLength];
        String[] str2Arr = new String[strLength];
        String[] answerArr = new String[strLength*2];
        
        
        
        for(int i = 0; i < strLength; i++){
            str1Arr[i] = String.valueOf(str1.charAt(i));
            str2Arr[i] = String.valueOf(str2.charAt(i));
        }
        
        int index = 0;
        for(int i = 0; i < strLength; i++){
            answerArr[index++] = str1Arr[i];
            answerArr[index++] = str2Arr[i];
        }
        
        for(int i = 0; i < answerArr.length; i++){
            answer += answerArr[i];
        }
        
        return answer;
    }
}