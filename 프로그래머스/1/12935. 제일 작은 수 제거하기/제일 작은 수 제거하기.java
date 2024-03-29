class Solution {
    public int[] solution(int[] arr) {
        
        int min = arr[0];
        int index = 0;
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        
        int[] answer = new int[arr.length-1];
        
        for(int i = 0; i < answer.length; i++){
            if(i < index){
                answer[i] = arr[i];
            }
            if(i >= index){
                answer[i] = arr[i+1];
            }
        }
        
        
        return answer;
    }
}