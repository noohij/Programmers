class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];

        int quo = money / 5500;
        int rem = money % 5500;

        answer[0] = quo;
        answer[1] = rem;

        return answer;
    }
}
