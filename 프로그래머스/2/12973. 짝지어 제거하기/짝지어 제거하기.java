import java.util.*;
class Solution {
    public int solution(String s){
        
        int answer = 0;
        Deque<Character> stack = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i ++) {
            char first = s.charAt(i);
            if (!stack.isEmpty() && stack.peek() == first) {
                stack.pop();
            } else {
                stack.push(first);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}