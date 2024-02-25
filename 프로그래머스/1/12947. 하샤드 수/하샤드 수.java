class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = x+"";
        int sum = 0;
        
        for(int i = 0; i < str.length(); i++){
            sum += Integer.parseInt(str.charAt(i)+"");
        }
        
        if(x % sum == 0){
            answer = true;
        }else{
            answer = false;
        }
        
        return answer;
    }
}