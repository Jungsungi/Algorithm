import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int z = 0; z < commands.length; z++) {
            int i = commands[z][0];
            int j = commands[z][1];
            int k = commands[z][2];
            
            int range = (j - i) + 1;
            
            int[] tempArr = new int[range];
            for (int y = 0; y < range; y++) {
                tempArr[y] = array[(i - 1) + y];
            }
            Arrays.sort(tempArr);
            
            answer[z] = tempArr[k - 1];
        }
        
        return answer;
    }
}