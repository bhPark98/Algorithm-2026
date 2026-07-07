class Solution {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();
        char[] ch = s.toCharArray();

        int countP = 0;
        int countY = 0;
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == 'p')
                countP++;
            else if(ch[i] == 'y')
                countY++;
        }

        if(countP != countY)
            answer = false;

        return answer;
    }
}