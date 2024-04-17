class Solution {
    public String solution(String s, int n) {

        char newC;
        String newString ="";

        for (char c : s.toCharArray()) {

            if (c == ' ') {
               newC = ' ';
            } else if (c > 64 && c < 91) { //대문자일 때
                if(c + n > 90) {  
                    newC = (char) (n - (90 - c) + 64);
                    // System.out.println(newC);
                } else {          
                    newC = (char) (c + n);
                }

            } else { //소문자일 때 
               if(c + n > 122)  {
                    newC = (char) (n - (122 - c) + 96);
                    System.out.println(newC);
                } else {           
                    newC = (char) (c + n);
                }
            }

            newString += newC;
        }

        return newString;
    }
}