class Solution {
    public long solution(int price, int money, int count) {
        long answer = money;
        
        for (int i = 1; i <= count; i++) {
            long nextPrice = (long) price * i;
            answer -= nextPrice;
        }
        
        if (answer >= 0) {
            return 0;
        } else {
            return Math.abs(answer);
        }
    }
}