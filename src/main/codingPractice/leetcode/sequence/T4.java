package main.codingPractice.leetcode.sequence;

public class T4 {
    public static void main(String[] args) {
        findMedianSortedArrays(new int[]{1, 3}, new int[]{3, 5});
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int lengthnums1 = nums1.length;
        int lengthnums2 = nums2.length;

        int i = 0, j = 0, status = 0;
        boolean marking = true;

        //中位数位置
        int index = (lengthnums1 + lengthnums2) / 2;
        //奇偶
        int oddEven = (lengthnums1 + lengthnums2) % 2;

        while (status < index) {
            if (nums1[i] > nums2[j]) {
                i++;
                marking = true;
            } else {
                j++;
                marking = false;
            }
            status++;
        }

        return status;


    }
}
