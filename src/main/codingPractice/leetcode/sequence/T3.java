package main.codingPractice.leetcode.sequence;

import main.codingPractice.leetcode.basedatastructure.ListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class T3 {
    /**
     * 便利
     *
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        /**
         * 遍历法
         */
//        Set<ListNode> set = new HashSet<ListNode>();
//        while (head != null) {
//            if (set.contains(head)) {
//                return true;
//            } else {
//                head = head.next;
//            }
//        }
//        return false;
        /**
         * 快慢指针
         */
        if(head == null || head.next == null){
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while(slow != fast){
            //快指针走到顶了
            if(fast == null || fast.next == null){
                return false;
            }

            // 快慢指针速度
            slow = slow.next;
            fast = fast.next.next;
        }
        //快慢指针相遇
        return true;
    }

    /**
     * 无重复字串
     * @param s
     * @return
     */
    public int lenghtOfLongestSubstring(String s){
        int n = s.length();

        //最大无重复字串
        int ans = 0;

        //存储元素已经对应位置
        Map<Character, Integer> map = new HashMap<>();

        for(int end = 0, start = 0; end < n ; end++){

            char alpha = s.charAt(end);

            //有结束字符串则重新开始
            if(map.containsKey(alpha)){
                start = Math.max(map.get(alpha), start);
            }

            ans = Math.max(ans, end - start + 1);

            map.put(s.charAt(end), start + 1);

        }
        return ans;
    }
}
