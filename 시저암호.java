public class 시저암호 {

    public static String solution(String s, int n) {
        char newC; //변환된 문자
        String newString = ""; //변환된 문자를 저장할 문자열

        for (char c : s.toCharArray()) { //문자열을 배열로 바꿔주고 한 문자씩 돌음.
            if (c == ' ') { //공백일 때
                newC = ' '; //변환 없이 그대로 새 문자열에 저장
            } else if (c > 64 && c < 91) { //대문자일 때 (A: 65 ~ Z: 90)
                if (c + n > 90) { //현재 문자에서 n거리를 밀었을 때, 소문자의 최대 범위를 넘어가면     //if( n > 90 - c)
                    newC = (char) (n - (90 - c) + 64); //n: 총 가야될 거리. 90 - c: 최대 범위까지 갈 수 있는 거리.
                    //c: 88(x), n: 3 이면 90(z)까지 가고 한칸 더가서 64(a)에 와야됌.
                } else {
                    newC = (char) (c + n); //현재 문자에서 n거리를 밀었을 때, 소문자의 최대 범위를 안넘으면 그냥 더해주고 변환.
                }

            } else { //소문자일 때 (a: 97 ~ z: 122)
                if (c + n > 122) {
                    newC = (char) (n - (122 - c) + 96);
                } else {
                    newC = (char) (c + n);
                }
            }
            newString += newC;
        }

        return newString;
    }

    public static void main(String[] args) {
        System.out.println(시저암호.solution("a B z", 4));
    }
}
