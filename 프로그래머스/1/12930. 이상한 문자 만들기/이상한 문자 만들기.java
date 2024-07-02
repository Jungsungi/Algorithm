class Solution {
    public String solution(String s) {
        String [] array = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < array.length; i++) {
            String str = array[i];

            for (int j = 0; j < str.length(); j ++) {
                if (j % 2 == 0) {
                    sb.append(String.valueOf(str.charAt(j)).toUpperCase());
                } else {
                    sb.append(String.valueOf(str.charAt(j)).toLowerCase());
                }
            }

            if (i != array.length -1) {
                 sb.append(" ");
            }


        }
        
        return sb.toString();
    }
}