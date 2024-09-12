class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        int[] answer = new int[photo.length];
        
        for (int i = 0; i < photo.length; i++) {
            int totalScore = 0;
            
            for (int j = 0; j < photo[i].length; j++) {
                String person = photo[i][j];
                
                for (int k = 0; k < name.length; k++) {
                    if (person.equals(name[k])) {
                        totalScore += yearning[k];
                        break;
                    }
                }
            }
            answer[i] = totalScore;
        }
        return answer;
    }
}
