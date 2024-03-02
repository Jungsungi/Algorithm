class Solution {
    public String solution(String s) {
        String answer = "";
        int tmp = 0;
        if(s.length() % 2 == 0){
            tmp = (s.length() / 2)-1;
            answer = s.charAt(tmp)+"";
            answer += s.charAt(tmp+1)+"";
        }else{
            tmp = (s.length() / 2);
            answer = s.charAt(tmp)+"";
        }
        return answer;
    }
}