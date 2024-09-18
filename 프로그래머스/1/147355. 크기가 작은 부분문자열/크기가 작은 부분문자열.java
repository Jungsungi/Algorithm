class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int size = p.length();
        long value = Long.valueOf(p);
        
        for (int i = 0; i < t.length() - size + 1; i++) {
            long sub = Long.valueOf(t.substring(i, i + size));
            
            if (sub <= value) {
                answer++;
            }
        }
        
        return answer;
    }
}