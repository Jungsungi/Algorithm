class Solution {
    public String solution(String s) {
        
        String [] arr = s.split(" ");
        int [] int_arr = new int[arr.length];
        
        for(int i = 0; i<arr.length; i++){
            int_arr[i]=Integer.parseInt(arr[i]);
        }
        
        int max = int_arr[0];
        int min = int_arr[0];
        
        for(int i =0; i<int_arr.length; i++){
            if(max < int_arr[i]){
                max = int_arr[i];
            }
            if(min > int_arr[i]){
                min = int_arr[i];
            }
        }
        
        String answer = min+" "+max;
        return answer;
    }
}