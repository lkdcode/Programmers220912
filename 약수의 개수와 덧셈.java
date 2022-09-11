class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        int i = 1;
		int count = 0;
		int leftnum = left;
		int rightnum = right;

		int plusnum = 0;
		int subnum = 0;

		for (; leftnum <= rightnum; leftnum++) {

			for (i = 1; i <= leftnum; i++) {
				if (leftnum % i == 0) {

					count++;
				}
			}
			if (count % 2 == 0) {
				plusnum += leftnum;
			}
			if (count % 2 != 0) {
				subnum += leftnum;
			}

			count = 0;
		
		}
		answer = plusnum-subnum;
        
        
        
        
        
        
        
        return answer;
    }
}