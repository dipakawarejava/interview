package com.interview.question.six;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NonNumericToNumericConversion {
    public static void main(String[] args) {
        String inputString = "$180,240/y";
        System.out.println(inputString.replaceAll("[^\\d]", ""));

    }
}