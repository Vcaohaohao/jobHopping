package main.codingPractice.leetcode.sequence;

public class T6 {
    public static void main(String[] args) {
        convert("PAYPALISHIRING",3);
    }
    public static String convert(String s, int numRows) {

        int t = numRows * 2 -2;
        int c = (s.length() + t - 1) / t * (numRows - 1);

        //生成一个N*N的数组
        char[][] martix = new char[numRows][c];

        for (int i = 0, x = 0, y = 0; i < s.length(); i++) {

            //填入数值
            martix[x][y] = s.charAt(i);
            if(i % t < numRows -1){
                //向下移动
                ++x;
            }else{
                //向右上移动
                --x;
                ++y;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(char[] row : martix){
            for(char ch : row){
                if(ch!= 0){
                    stringBuilder.append(ch);
                }
            }
        }

        return stringBuilder.toString();
    }
}
