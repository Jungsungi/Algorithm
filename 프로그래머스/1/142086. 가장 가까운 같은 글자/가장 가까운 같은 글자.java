import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int[] answer = new int [len];
        Map<String, Integer> map = new HashMap<>();
        for(int i =0; i<s.length(); i++){
            if(map.get(s.charAt(i)+"") == null){
                answer[i] = -1;
                map.put(s.charAt(i)+"",i);
            }else{
                answer[i] = i-map.get(s.charAt(i)+"");
                map.put(s.charAt(i)+"",i);
            }
        }
        
        return answer;
    }
}