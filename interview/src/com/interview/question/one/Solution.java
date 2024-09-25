package com.interview.question.one;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        int[] A1 = { 130, 191, 200, 10 };
        System.out.println(findMaxSumWithMatchingDigits(A1)); // Should print 140
        int[] A2 = { 405, 45, 300, 300 };
        System.out.println(findMaxSumWithMatchingDigits(A2)); // Should print 600
        int[] A3 = { 50, 222, 49, 52, 25 };
        System.out.println(findMaxSumWithMatchingDigits(A3)); // Should print -1
        int[] A4 = { 30, 909, 3190, 99, 3990, 9009 };
        System.out.println(findMaxSumWithMatchingDigits(A4)); // Should print -9918
    }

    public static int findMaxSumWithMatchingDigits(int[] arr) {
        int maxSum = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (hasMatchingFirstAndLastDigits(arr[i], arr[j])) {
                    int sum = arr[i] + arr[j];
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }

        return maxSum;
    }

    public static boolean hasMatchingFirstAndLastDigits(int num1, int num2) {
        String str1 = Integer.toString(num1);
        String str2 = Integer.toString(num2);
        return str1.charAt(0) == str2.charAt(0) && str1.charAt(str1.length() - 1) == str2.charAt(str2.length() - 1);
    }

    public static void main2 (String[] args) {

    }
}