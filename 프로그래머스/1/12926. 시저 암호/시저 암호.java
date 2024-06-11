class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String[] downArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y" ,"z"};
        String[] upperArr = String.join(",", downArr).toUpperCase().split(",");
        
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            int index = 0;
            String value = String.valueOf(chr);
            
            if (('a' <= chr) && (chr <= 'z')) {
                for (int j = 0; j < downArr.length; j++) {
                    if (downArr[j].equals(value)) {
                        index = j;
                        break;
                    }
                }
                
                for (int j = 0; j < n; j++) {
                    if (index == downArr.length-1) {
                        index = -1;
                    }
                    index++;
                }
                answer += downArr[index];
            } else if (('A' <= chr) && (chr <= 'Z')) {
                for (int j = 0; j < upperArr.length; j++) {
                    if (upperArr[j].equals(value)) {
                        index = j;
                        break;
                    }
                }
                for (int j = 0; j < n; j++) {
                    
                    if (index == upperArr.length-1) {
                        index = -1;
                    }
                    index++;
                }
                answer += upperArr[index];
            } else {
                answer += value;
            }
        }
        
        return answer;
    }
}