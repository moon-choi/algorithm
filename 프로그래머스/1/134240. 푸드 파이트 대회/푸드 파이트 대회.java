class Solution {
    public String solution(int[] food) {
        String left = "";
        String right = "";
        String result = "";

        for(int i = 1; i < food.length; i++){
            int num = food[i];

            if(num < 2 ){
                continue;
            }

            if(num % 2 != 0) {
                num = num - 1;
            }

            //여기까지 완료하면 num 은 모두 2 이상의 짝수가 됌. 
            //한쪽만 완성해야돼니까 2로 나눠 줌. 
            num = num / 2;


            // num: 4 -> 2.
            // 반복 2번해야함. 
            for(int j = 0; j < num; j++) {
                left += i; 
                //j = 0 일때 string 은 2. 
                //j = 1일 때 string은 22. 
            }
        }

        //여기까지하면 string은 122333
        //이제 0붙여주고 뒤집은거 붙여야됌.
        
        StringBuffer left_ = new StringBuffer(left);
        right = left_.reverse().toString();
        result = left + "0" + right;

        return result;
    }
}