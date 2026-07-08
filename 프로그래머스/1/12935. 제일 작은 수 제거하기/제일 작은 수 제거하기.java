class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];

        if(answer.length == 0)
            return new int[]{-1};

        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }

        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == min) {
                continue;
            }
            answer[j++] = arr[i];
        }

        return answer;
    }
}