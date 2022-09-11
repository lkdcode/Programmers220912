class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        
        int leng = numbers.length;

		for (int i = 0; i < leng; i++) {
			answer -= numbers[i];
		}

        return answer;
    }
}