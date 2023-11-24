import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.Iterator;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        HashSet<Integer> tempSet = new HashSet<Integer>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = (i+1); j < numbers.length; j++){
                tempSet.add(numbers[i] + numbers[j]);
            }
        }
        
        int tempSetSize = tempSet.size();
        int[] answerArr = new int[tempSetSize];
        Iterator<Integer> iter = tempSet.iterator();	
        
        int k = 0;
        while (iter.hasNext()) {
            answerArr[k] = iter.next();
            k++;
        }
        
        Arrays.sort(answerArr);
        answer = answerArr;
        
        return answer;
    }
}