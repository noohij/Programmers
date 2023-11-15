class Solution {
    public int solution(int hp) {
        int jAnt = 0;
        int bAnt = 0;
        int iAnt = 0;
        
        jAnt = hp / 5;
        bAnt = (hp - (5 * jAnt)) / 3;
        iAnt = (hp - (5 * jAnt) - (3 * bAnt));
        
        int answer = jAnt + bAnt + iAnt;
        
        return answer;
    }
}