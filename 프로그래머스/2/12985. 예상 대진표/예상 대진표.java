class Solution {
    public int solution(int n, int a, int b) {
        int answer = 1;
        int round = n;
        int aNum = a;
        int bNum = b;

        while (round > 0) {
            round = round/2;

            //이웃한 자연수
            if(aNum+1 == bNum){
                if(aNum % 2 != 0){
                    break;
                }
            } else if (bNum+1 == aNum) {
                if(bNum % 2 != 0){
                    break;
                }
            }
            answer++;
            
            aNum = (aNum / 2) + (aNum % 2);
            bNum = (bNum / 2) + (bNum % 2);
        }

        return answer;
    }
}