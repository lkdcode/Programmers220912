class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0; 
        int absleng = absolutes.length;

		for (int i = 0; i < absleng; i++) {
			if (signs[i] == false) {
				absolutes[i] *= -1;
			}
			answer += absolutes[i];
		}
        return answer;
    }
}