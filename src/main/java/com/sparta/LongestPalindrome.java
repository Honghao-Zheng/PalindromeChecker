package com.sparta;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LongestPalindrome {
    public static ArrayList<String> find(String sentence){

        String[] arrOfWords=sentence.split(" ");
        ArrayList<String> arrlistOfWords= new ArrayList<String>(Arrays.asList(arrOfWords));
        ArrayList<String> arrOfLongestPalindrome=new ArrayList<String>();
        boolean isPalindrome;
        int palindromeLength;

        if(sentence.equals("")){
            return arrOfLongestPalindrome;
        } else{

        }

        arrOfLongestPalindrome = findLongestPalindromeGivenSentence(arrlistOfWords, arrOfLongestPalindrome);
        System.out.println(arrOfLongestPalindrome.equals(new ArrayList<>()));
        return arrOfLongestPalindrome;
    }

    private static ArrayList<String> findLongestPalindromeGivenSentence(ArrayList<String> arrlistOfWords, ArrayList<String> arrOfLongestPalindrome) {
        boolean isPalindrome;
        int palindromeLength;
        int maxLengthOfPalindrome=0;
        for(String word: arrlistOfWords){
            word=word.trim();
            isPalindrome= PalindromeChecker.isPalindrom(word);
            if(isPalindrome){
                palindromeLength= word.length();
                if(palindromeLength > maxLengthOfPalindrome){
                    maxLengthOfPalindrome =palindromeLength;
                    arrOfLongestPalindrome =new ArrayList<String>();
                    arrOfLongestPalindrome.add(word);
                } else if(palindromeLength == maxLengthOfPalindrome && !arrOfLongestPalindrome.contains(word)){
                    arrOfLongestPalindrome.add(word);
                }
            }
        }
        return arrOfLongestPalindrome;
    }


    public static void main(String[] args) {
        find(new String("hello wow") );
    }

}
