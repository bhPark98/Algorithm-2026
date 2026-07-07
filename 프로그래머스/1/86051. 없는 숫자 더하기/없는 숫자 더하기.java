class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        String str = "";
        for(int i = 0; i < numbers.length; i++){
            str += numbers[i];
        }

        for(int i = 0; i <= 9; i++) {
            if(!str.contains(Integer.toString(i))) {
                answer += i;
            }
        }

        return answer;
    }
}