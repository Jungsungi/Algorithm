class Solution {
    public int solution(int num) {
        int answer = 0;
        long no = (long) num;
        if(num == 1){
            return 0;
        }
        
        while(true){
            answer++;
            
            if(answer >= 500){
                return -1;
            }
            //짝수라면
            if(no % 2 ==0){
                no = no/2;
            }else{  //홀수라면
                no = (no*3)+1;
            }
            if(no == 1){
                break;
            }
        }
        
        
        return answer;
    }
}