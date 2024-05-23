class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max = 0;
        int min = 0;
        
        if (sides[0] >= sides[1]) {
            max = sides[0];
            min = sides[1];
        } else if (sides[0] < sides[1]) {
            max = sides[1];
            min = sides[0];
        } else {
            answer = 1;
            return answer;
        }
        
        // 가장 긴 변이 배열에 있는 경우
        for (int i = (max - min) + 1; i <= max; i++) {
            answer++;
        }
        
        // 가장 긴 변이 배열에 없는 경우
        for (int i = (min + max) -1; i > max; i--) {
            answer ++;
        }
        
        return answer;
    }
}