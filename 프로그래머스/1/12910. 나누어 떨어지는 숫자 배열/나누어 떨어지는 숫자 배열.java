import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int size = 0;
        String str = "";
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                str+=arr[i]+",";
                size++;
            }
        }
        
        if(size == 0){
            int [] answer = {-1};
            return answer;
        }
        
        int [] answer = new int[size];
        
        String[] array = str.split(",");
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = Integer.parseInt(array[i]);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}