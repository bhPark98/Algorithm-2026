class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        long b = Long.parseLong(p);
        for(int i = 0; i < t.length() - p.length() + 1; i++) {
            String str = "";
            for(int j = i; j < i + p.length(); j++) {
                str += t.charAt(j);
            }
            long a = Long.parseLong(str);

            if(a <= b)
                answer++;
        }

        return answer;
    }
}