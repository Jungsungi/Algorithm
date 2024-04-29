class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int x = 1;
        
        for (int num : num_list) {
            sum += num;
            x *= num;
        }
        
        if (sum * sum > x) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}