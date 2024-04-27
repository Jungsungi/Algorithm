class Solution {
    public int solution(double flo) {
        int answer = 0;
        String str = String.valueOf(flo);
        
        answer = Integer.parseInt(str.substring(0, str.lastIndexOf(".")));
        
        return answer;
    }
}