package main.codingPractice.leetcode.sequence;

public class T7 {
    public static int reverse(int x) {

        try {
            //默认是正数
            Boolean plusOrMinus = true;
            if(x<0){
                plusOrMinus = false;
                x= Math.abs(x);
            }
            StringBuilder tmp= new StringBuilder(String.valueOf(x));

            StringBuilder reverse = tmp.reverse();

            if(!plusOrMinus){
                return -Integer.parseInt(reverse.toString());
            }
            return Integer.parseInt(reverse.toString());
        }catch (Exception e){
            return 0;
        }

    }
}
