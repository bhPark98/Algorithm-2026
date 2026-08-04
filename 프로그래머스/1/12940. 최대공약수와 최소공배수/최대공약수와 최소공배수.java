class Solution {
    public int[] solution(int n, int m) {
        int bigNum = 0;
        if(n < m) {
            for(int i = 1; i <= n; i++) {
                if(m % i == 0 && n % i == 0) {
                    bigNum = i;
                }
            }
        } else {
            for(int i = 1; i <= m; i++) {
                if(n % i == 0 && m % i == 0) {
                    bigNum = i;
                }
            }
        }

        int smallNum = (n * m) / bigNum;

        int[] answer = new int[2];
        answer[0] = bigNum;
        answer[1] = smallNum;

        return answer;
    }
}