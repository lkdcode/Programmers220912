import java.util.Arrays;

class Solution {
    public String solution(String s) {
         
        int sLeng = s.length();
		char[] ch = new char[sLeng];

		for (int i = 0; i < sLeng; i++) {
			ch[i] = s.charAt(i);
		}
		Arrays.sort(ch);

		StringBuilder answer = new StringBuilder(new String(ch));

        return answer.reverse().toString();
    }
}