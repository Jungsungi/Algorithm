class Solution {
    public int[] solution(String s) {
        int count = 0;
        int zeroCount = 0;
        
        while(true) {
            count++;
            
            zeroCount += countZero(s);
            String delete0 = s.replaceAll("0", "");
            
            int size = delete0.length();
            s = Integer.toBinaryString(size);
            
            if (s.equals("1")) {
                break;
            }
            
        }
        
        int[] answer = {count, zeroCount};
        
        return answer;
    }
    
    public int countZero(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i ++) {
            if ('0' == str.charAt(i)) {
                count ++;
            }
        }
        
        return count;
    }
}