class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int num = phone_number.length();
        for(int i = 0; i < num - 4; i++){
            answer+="*";
        }
        answer+=phone_number.substring(num-4, num);
        return answer;
    }
}