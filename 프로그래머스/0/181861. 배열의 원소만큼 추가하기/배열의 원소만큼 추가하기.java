class Solution {
    public int[] solution(int[] arr) {
        int count = 0;
        int init = 0;
        
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        
        int[] answer = new int[count];
        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            
            for (int j = init; j < answer.length; j++) {
                answer[j] = num;
            }
            
            for (int k = 0; k < num; k++) {
                init++;
            }
        }
        
        return answer;
    }
}