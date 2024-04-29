class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            char chr = my_string.charAt(i);
            if (chr == alp.charAt(0)) {
                chr = (char)(chr - 32);
            }
            answer += String.valueOf(chr);
        }
        
        return answer;
    }
}