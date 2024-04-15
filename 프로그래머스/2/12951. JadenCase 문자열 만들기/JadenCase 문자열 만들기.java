class Solution {
    public String solution(String s) {
        String [] splitArr = s.split(" ");
        String result = "";
        
        boolean lastChk = false;    // 마지막에 공백글자인 경우 체크
        if (s.substring(s.length()-1).equals(" ")){
            lastChk = true;
        }
        
        for (int i = 0; i < splitArr.length; i++) {
            String str = splitArr[i];
            String tmp = "";
            if (str != null && !str.equals(" ")){
                for (int j = 0; j < str.length(); j++) {
                    char chr = str.charAt(j);
                    if (j == 0) { // 첫번째 글자 변환
                        if ('a' <= chr && chr <= 'z') {
                            chr = (char) (chr - 32);
                        }
                    } else {    // 2번째 글자부터 변환
                        if ('A' <= chr && chr <= 'Z') {
                            chr = (char) (chr + 32);
                        }
                    }
                    tmp += String.valueOf(chr);
                }
            } else {
                tmp = str;
            }
            
            if (i == splitArr.length -1) {
                result += tmp;
            } else {
                result += tmp + " ";
            }
        }
        
        if (lastChk) {
            result += " ";
        }
        
        return result;
    }
}