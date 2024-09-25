package com.interview.question.three;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main (String[] args) {
        Solution solve = new Solution();
        System.out.println(solve.solution("aaAbcCABBc"));
        System.out.println(solve.solution("xyzXYZabcABC"));
        System.out.println(solve.solution("ABCabcAefG"));

    }
    public int solution(String letters){
        Map<Character, List<Integer>> allLetters = new HashMap<>();
        int count =0;
        for ( int i=0 ; i < letters.toCharArray().length;i++) {
             List<Integer> charIndexes = allLetters.get(letters.charAt(i));
             if(charIndexes !=null){
                 charIndexes.add(i);
             }
             else {
                List<Integer> indexLst =  new ArrayList<>();
                indexLst.add(i);
                allLetters.put(letters.charAt(i), indexLst);
             }

        }


        for ( Map.Entry<Character, List<Integer>> entry : allLetters.entrySet()){

            final Character key = entry.getKey();
            if(Character.isLowerCase(key) && allLetters.containsKey(Character.toUpperCase(key))){
                final List<Integer> lowerLettersIndexes = allLetters.get(key);
                final List<Integer> upperLettersIndexes =allLetters.get(Character.toUpperCase(key));
                final Integer lowerCharMaxIndex = lowerLettersIndexes.stream().reduce(Integer::max).get();
                final Integer upperCharMinIndex = upperLettersIndexes.stream().reduce(Integer::min).get();
                if(lowerCharMaxIndex < upperCharMinIndex){
                    count++;
                }
            }
        }
        return count;

    }
}
