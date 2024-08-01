class Solution {
    public int solution(int n, String control) {
        int answer = n;
        int controlLength = control.length();
        
        String[] controlArr = new String[controlLength];
        for(int i = 0; i < controlLength; i++){
            controlArr[i] = String.valueOf(control.charAt(i));
        }
        
        for(int j = 0; j < controlLength; j++){
            if(controlArr[j].equals("w")){
                answer = answer + 1;
            } else if(controlArr[j].equals("s")){
                answer = answer - 1;
            } else if(controlArr[j].equals("d")){
                answer = answer + 10;
            } else if(controlArr[j].equals("a")){
                answer = answer - 10;
            }
        }
        
        return answer;
    }
}
