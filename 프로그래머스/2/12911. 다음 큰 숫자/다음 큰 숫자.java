class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String binary = Integer.toBinaryString(n);
        
        int count = getCount(binary);
        
        answer = n+1;
        
        while (true) {
            
            String binaryStr = Integer.toBinaryString(answer);
            
            int num = getCount(binaryStr);
            
            if (num == count) {
                break;
            }
            
            answer++;
        }
        
        return answer;
    }
    
    // 2진수 1의 개수 구하는 함수
    public static int getCount(String str) {
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            if (chr == '1') {
                count ++;
            }
        }
        
        return count;
    }
}