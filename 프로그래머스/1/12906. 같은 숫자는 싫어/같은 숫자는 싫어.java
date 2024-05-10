import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        int temp = 0;
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            if (i > 0) {
                temp = arr[i-1];
                
                int num = list.size();
                
                if (arr[i-1] == arr[i]) {
                    list.remove(num-1);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
        
    }
}