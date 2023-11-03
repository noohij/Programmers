class Solution {
    public int[] solution(int start_num, int end_num) {
        
        int arrCnt = end_num - start_num + 1;
        int[] answer = new int[arrCnt];

        for(int i = 0; i < arrCnt; i++) {
            answer[i] = start_num + i;
        }

        return answer;
    }
}