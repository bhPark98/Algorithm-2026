class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        String str = Integer.toString(x);
        int ans = 0;
        for(int i = 0; i < str.length(); i++) {
            ans += str.charAt(i) - '0';
        }

        if(x % ans != 0)
            answer = false;

        return answer;
    }
}