class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = n+"";
        Long temp;
        
        long[] arr = new long [str.length()];
        
        for(int i = 0; i < str.length(); i++){
            arr[i] = Long.parseLong(str.charAt(i)+"");
        }
        
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        str = "";
        for(int i = 0; i<arr.length; i++){
            str += arr[i]+"";
        }
        answer = Long.parseLong(str);
        return answer;
    }
}