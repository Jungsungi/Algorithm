import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        Character[] arr = new Character[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            arr[i] = chr;
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        for (Character chr : arr) {
            answer += String.valueOf(chr);
        }
        
        return answer;
    }
}