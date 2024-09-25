package com.interview.question.two;

public class Solution {
    public static void main (String[] args) {
        Solution solution = new Solution();
        System.out.println("BAAABAB  o/p should be 2 and found = "+solution.solution("BAAABAB"));
        System.out.println("BBABAA  o/p should be 3 and found = "+solution.solution("BBABAA"));
        System.out.println("AABBBB  o/p should be 0 and found = "+solution.solution("AABBBB"));
        System.out.println("B  o/p should be 0 and found = "+solution.solution("B"));

    }
    public  int solution(String s){
        int minDeletion = 0,numberOfBs=0;
        for(char c: s.toCharArray()){
            if(c=='A'){
                minDeletion = Math.min(numberOfBs,minDeletion+1);
            }else{
                numberOfBs++;
            }
        }
        return minDeletion;
    }
}