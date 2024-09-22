class Solution {
    public int solution(long num) {
        if (num == 1) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < 500; i++) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
            count++;

            if (num == 1) {
                return count;
            }
        }

        return -1;
    }
}
