class Solution {
    public int solution(int n) {
        int answer = 0;
        int tmp = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++){
                tmp += j;
                if (tmp == n) {
                    answer++;
                    break;
                }
                if (tmp > n) {
                    break;
                }
            }
            tmp = 0;
        }
        
        return answer;
    }
}