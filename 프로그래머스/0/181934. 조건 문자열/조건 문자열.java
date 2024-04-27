class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean result = false;
        
        switch (ineq+eq) {
            case "<=" :
                result = n <= m;
                break;
            case "<!" :
                result = n < m;
                break;
            case ">=" :
                result = n >= m;
                break;
            default :
                result = n > m;
        }
        
        answer = (result) ? 1 : 0;
        
        return answer;
    }
}