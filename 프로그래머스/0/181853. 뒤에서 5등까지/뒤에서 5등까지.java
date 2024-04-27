class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        int min = 0;
        int temp = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            min = num_list[i];
            for (int j = i+1; j < num_list.length; j++) {
                if (num_list[j] < min) {
                    min = num_list[j];
                    temp = num_list[j];
                    num_list[j] = num_list[i];
                    num_list[i] = temp;
                }
            }
        }
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i];
        }
        
        return answer;
    }
}