class Solution {
    public int[] solution(int n, int m) {
        int max = n;
        int min = m;
        
        if (m > n) {
            max = m;
            min = n;
        }
        
        int[] answer = new int[2];
        
        answer[0] = calcMax(max, min);
        answer[1] = calcMin(max, min, answer[0]);
        
        return answer;
    }
    
    
    public int calcMax(int max, int min) {
        int result;
        int temp;
        
        while(true) {
            temp = max % min;
            if (temp == 0) {
                result = min;
                break;
            }
            max = min;
            min = temp;
        }
        return result;
    }
    
    public int calcMin(int max, int min, int calMax) {
        return (max * min) / calMax;
    }
}