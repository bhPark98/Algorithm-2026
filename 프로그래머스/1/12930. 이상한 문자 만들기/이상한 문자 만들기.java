class Solution {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split(" ", -1);
        for(int i = 0; i < str.length; i++) {
            String s2 = str[i];
            for(int j = 0; j < s2.length(); j++) {
                if(j % 2 == 0)
                    answer += String.valueOf(s2.charAt(j)).toUpperCase();
                else
                    answer += String.valueOf(s2.charAt(j)).toLowerCase();
            }
            answer += " ";
        }

        answer = answer.substring(0, answer.length() - 1);

        return answer;
    }
}