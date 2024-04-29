import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] splitArr = my_string.split(" ");
        List<String> strList = new ArrayList<>();
        
        for (String str : splitArr) {
            if (str == null || !str.equals("")){
                strList.add(str);
            }
        }
        
        String [] answer = new String[strList.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = strList.get(i);
        }
        
        return answer;
    }
}