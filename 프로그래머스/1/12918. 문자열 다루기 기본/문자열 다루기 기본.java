class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() == 4 || s.length() == 6){
            for(int i = 0; i < s.length(); i++){
                char chr = s.charAt(i);
                if('0'> chr || chr>'9'){
                    answer = false;
                }
            }
        }else{
            answer = false;
        }
        return answer;
    }
}