import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums) {
            set.add(num);
        }
        
        int num = set.size();
        
        if (num > (nums.length / 2)) {
            num = nums.length / 2;
        }
        
        return num;
    }
}