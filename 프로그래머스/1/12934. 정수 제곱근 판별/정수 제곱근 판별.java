class Solution {
    public long solution(long n) {
        long answer = -1;
        long num = 1;
        
        while(num * num < n){
            num = num+1;
        }
        
        if(num * num == n){
            return (num+1) * (num+1);
        }
        
        return answer;
    }
}