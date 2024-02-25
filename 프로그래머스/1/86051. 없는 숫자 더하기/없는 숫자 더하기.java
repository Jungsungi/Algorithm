import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int [] arr = new int[10];
        boolean flag = false;
        
        for(int i =0; i<10; i++){
            arr[i] = i;
        }
        
        for(int i =0; i < arr.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(arr[i] == numbers[j]){
                    flag = true;
                }
            }
            if(flag == false){
                answer += arr[i];
            }
            flag = false;
        }
        
        return answer;
    }
}