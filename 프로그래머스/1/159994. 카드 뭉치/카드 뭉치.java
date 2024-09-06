import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Deque<String> que1 = new ArrayDeque<>();
        Deque<String> que2 = new ArrayDeque<>();
        boolean flag = true;
        
        que1.addAll(Arrays.asList(cards1));
        que2.addAll(Arrays.asList(cards2));

        for (String target : goal) {
            if (!que1.isEmpty() && que1.peek().equals(target)) {
                que1.poll();
            } else if (!que2.isEmpty() && que2.peek().equals(target)) {
                que2.poll();
            } else {
                flag = false;
                break;
            }
        }
        
        return flag ? "Yes" : "No";
    }
}