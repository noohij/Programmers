class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int sLength = s.length();
        int pCount = 0;
        int yCount = 0;
        
        String[] givenString = new String[sLength];
        
        for(int i = 0; i < sLength; i++) {
            char currentChar = Character.toLowerCase(s.charAt(i));
            if (currentChar == 'p') {
                pCount++;
            } else if (currentChar == 'y') {
                yCount++;
            }
        }
        
        if(pCount != yCount) {
            answer = false;
        }

        return answer;
    }
}