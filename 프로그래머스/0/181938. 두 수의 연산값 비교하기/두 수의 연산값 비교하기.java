class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str = String.valueOf(a) + String.valueOf(b);
        int num = 2 * a * b;
        
        answer = (num > Integer.parseInt(str)) ? num : Integer.parseInt(str);
        
        return answer;
    }
}