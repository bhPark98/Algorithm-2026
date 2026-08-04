import java.util.*;

class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for(int i = arr.length - 1; i >= 0; i--) {
            if(stack.isEmpty())
                stack.push(arr[i]);
            else {
                if(stack.peek() != arr[i]) {
                    stack.push(arr[i]);
                }
            }

        }

        int[] answer = new int[stack.size()];

        int len = stack.size();
        for(int i = 0; i < len; i++) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}