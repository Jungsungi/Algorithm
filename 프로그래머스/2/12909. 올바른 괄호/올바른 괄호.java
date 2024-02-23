class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int leftCnt = 0;
        int rightCnt = 0;
        
        if(s.length() % 2 != 0){
            answer = false;
            return answer;
        }

        if(s.charAt(0) == ')'){
            answer = false;
            return answer;
        }
        
        if(s.charAt(s.length()-1) == '('){
            answer = false;
            return answer;
        }
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                leftCnt++;
            } else{
                rightCnt++;
            }
            if(rightCnt > leftCnt){
                answer = false;
                return answer;
            }
        }
        
        if(leftCnt != rightCnt){
            answer = false;
            return answer;
        }

        return answer;
    }
}