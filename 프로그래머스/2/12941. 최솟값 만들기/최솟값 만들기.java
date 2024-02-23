import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Integer [] tmpB = new Integer[B.length];
        
        for(int i = 0; i < B.length; i++){
            tmpB[i] = B[i];
        }
        
        Arrays.sort(A);
        Arrays.sort(tmpB, Collections.reverseOrder());
        
        for(int i = 0; i < A.length; i++){
            answer += A[i]*tmpB[i];
        }

        return answer;
    }
}