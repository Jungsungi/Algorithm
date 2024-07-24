import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j <numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        Object[] array = set.toArray();
        Arrays.sort(array);
        
        int[] answer = new int[array.length];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (Integer) array[i];
        }
        
        return answer;
    }
}