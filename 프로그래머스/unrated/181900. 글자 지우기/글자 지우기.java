import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";

        String[] myStrArr = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            myStrArr[i] = String.valueOf(my_string.charAt(i));
        }

        List<String> myStrList = new ArrayList<>(Arrays.asList(myStrArr));

        Arrays.sort(indices);
        for (int j = indices.length - 1; j >= 0; j--) {
            int indexToRemove = indices[j];

            if (indexToRemove >= 0 && indexToRemove < myStrList.size()) {
                myStrList.remove(indexToRemove);
            }
        }

        String[] answerStrArr = myStrList.toArray(new String[0]);

        for (int k = 0; k < answerStrArr.length; k++) {
            answer += answerStrArr[k];
        }
        return answer;
    }
}
