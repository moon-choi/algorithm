class Solution {
    public int solution(String s) {
       String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
       for(int i = 0; i < nums.length; i++){
            String word = nums[i];
            if(s.contains(word)) {
                s = s.replaceAll(word, Integer.toString(i));
            }
        }
        
        return Integer.parseInt(s);
    }
}