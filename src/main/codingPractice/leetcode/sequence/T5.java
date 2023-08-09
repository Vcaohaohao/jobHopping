package main.codingPractice.leetcode.sequence;

public class T5 {
    public static void main(String[] args) {
        longestPalindrome("aaaaaa");
    }

    // babad
    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        int maxLen = 1;
        int begin = 0;

        //dp[i][j] 表示s[i][j] 是否是回文串
        boolean[][] dp = new boolean[len][len];

        //初始化,所有长度为1的都是回文串
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        //转为数组使用，避免频繁charAt
        char[] charArray = s.toCharArray();

        //开始递推
        for (int l = 2; l <= len; l++) {
            for (int i = 0; i < len; i++) {
                int j = l + i - 1;

                if (j >= len) {
                    break;
                }
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    //如果只有两个元素且相等
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                // 只要 dp[i][L] == true 成立，就表示子串 s[i..L] 是回文，此时记录回文长度和起始位置
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }
}
