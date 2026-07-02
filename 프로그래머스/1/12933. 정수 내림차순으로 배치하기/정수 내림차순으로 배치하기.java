import java.util.*;

class Solution {
    public long solution(long n) {
        String answer = "";

        String str = Long.toString(n);

        int[] arr = new int[str.length()];
        for(int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }

        Integer[] intArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(intArr, Collections.reverseOrder());

        for(int i = 0; i < intArr.length; i++) {
            answer += intArr[i];
        }

        return Long.parseLong(answer);
    }
}