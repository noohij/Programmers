class Solution {
    public int solution(int[] num_list) {
        
        int allTimes = 1;
        int allAdd = 0;
        int answer;
        
        for(int i = 0; i < num_list.length; i++) {
            allAdd += num_list[i];
            allTimes *= num_list[i];
        }
        int allSquareAdd = allAdd * allAdd;
        
        if(allSquareAdd > allTimes) {
            answer = 1;
        } else if(allSquareAdd < allTimes) {
            answer = 0;
        } else {
            answer = 2;
        }
    
        return answer;
    }
}