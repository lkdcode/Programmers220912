class Solution {
    public boolean solution(String s) {
        boolean answer = true;   
        int sLeng = s.length();

        for (int i = 0; i < sLeng; i++) {
			if (!(sLeng == 4 || sLeng == 6)) {
				answer = false;
				break;
			}
            int k = s.charAt(i) - 48;
			if (!(k >= 0 && k <= 9)) {
				answer = false;
				break;
			}

		}
        
        return answer;
    }
}