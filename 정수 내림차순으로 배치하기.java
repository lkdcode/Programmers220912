import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        
        String str1 = Long.toString(n);
		int str1leng = str1.length();

		int[] arr = new int[str1leng];

		for (int i = 0; i < str1leng; i++) {
			arr[i] = str1.charAt(i) - 48;
		}

		Arrays.sort(arr);

		String str2 = "";
		int j = str1leng;
		for (int i = 0; i < str1leng; i++) {
			str2 += arr[j - 1];
			j--;
		}

		answer = Long.parseLong(str2);
        return answer;
    }
}