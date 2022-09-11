import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        int arrleng = arr.length;

		int i = 0;
		int k = 0;

		for (i = 0; i < arrleng; i++) {
			if (arr[i] % divisor == 0) {
				k++;
			}
			answer = new int[k];
		}
        
		for (i = 0, k = 0; i < arrleng; i++) {
			if (arr[i] % divisor != 0) {
				continue;
			}
			answer[k++] = arr[i];
		}
		if (answer.length == 0) {
			answer = new int[1];
			answer[0] = -1;
		}
        
        
        Arrays.sort(answer);
        return answer;
    }
}