class Solution {
    public int solution(int n) {
        int answer = 0;
        long minus2 = 0L;
        long minus1 = 1L;
        long temp = 0L;
        
        if (n == 0) {
            return 0;
        } 
        
        if (n == 1) {
            return 1;
        }
        
        for (int i = 2; i <= n; i++) {
            temp = getNum(minus1, minus2);
            
            minus2 = minus1;
            minus1 = temp;
        }
        
        answer = (int) temp;
        
        
        return answer;
    }
    
    public static long getNum(long num1, long num2) {
        return (num1 + num2) % 1234567;
    }
}