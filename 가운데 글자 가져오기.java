class Solution {
    public String solution(String s) {
        String answer = "";
        int sLeng = s.length();

		if (sLeng % 2 != 0) {
			answer += s.charAt((sLeng / 2));
		}
		if (sLeng % 2 == 0) {
			answer += s.charAt((sLeng / 2) - 1);
			answer += s.charAt((sLeng / 2));
		}
        return answer;
    }
}