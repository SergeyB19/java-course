package com.zaurtregulov.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCGABCH";
//        Pattern pattern1 = Pattern.compile("ABC");

//        String s1 = "ABCOPABDOP";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[^e-g4-7]");


//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc(e|5)");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc.");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc5abcg6abch$");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("[0-9]");
//
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\d");
//
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\D");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w");

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\W");

//        String s1 = "abcd!?abce====abc ++5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w{4}");

//        String s1 = "abcd!?    abce====a    bc ++5abc   g6a bc  h";
//        Pattern pattern1 = Pattern.compile("\\w\\s+\\w");

//        String s1 = "abcd!?    abce====a    bc ++5abc   g6a bc  h!!!!!!!!!!!!!!!!!!!!!!!";
//        Pattern pattern1 = Pattern.compile("\\D{2,6}");

//        String s1 = "ABCABABВA";
//        Pattern pattern1 = Pattern.compile("(AB){2,3}");

//        String s1 = "DABCDABADABABABABD";
//        Pattern pattern1 = Pattern.compile("D(AB){2,}");
//
//        String s1 = "DABCDABABDA";
//        Pattern pattern1 = Pattern.compile("D(AB)*");

//        String s1 = "abcd abce abc5abcg6abch";;
//        Pattern pattern1 = Pattern.compile("\\Aabce");

//        String s1 = "abcd abce abc5abcg6abch";;
//        Pattern pattern1 = Pattern.compile("abce\\Z");

        String s1 = "abcd abcd4 afc4ced7";
        Pattern pattern1 = Pattern.compile("[abcd][efgh3-8]");




        Matcher matcher = pattern1.matcher(s1);

        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + " " + matcher.group());
        }
    }
}
