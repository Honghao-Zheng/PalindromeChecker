package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ProgramTest {
@ParameterizedTest
    @ValueSource(strings={"wow","poop","madam"})
    @DisplayName("test words that have length of 3,4,5 that are Palindrome")
    public void truePalindrome(String word) {
    boolean expectPassed = true;
    boolean result = PalindromeChecker.isPalindrom(word);
    Assertions.assertEquals(expectPassed, result);
}

    @ParameterizedTest
    @ValueSource(strings={"cat","moon","right"})
    @DisplayName("test words that have length of 3,4,5 are not Palindrome")
    public void falsePalindrome(String word){
        boolean expectPassed=false;
        boolean result= PalindromeChecker.isPalindrom(word);
        Assertions.assertEquals(expectPassed,result);

}
    @Test
    @DisplayName("given the sentence null to find longest palindrome")
    public void givenNullSentenceFindLongestPalindrome(){
        String input="";
        ArrayList<String> expected=new ArrayList<String>();
//        ArrayList<String> actual=new ArrayList<String>();
        ArrayList<String> actual=LongestPalindrome.find("");
        Assertions.assertEquals(expected,actual);
    }
    @Test
    @DisplayName("given the sentence 'hello wew' to find longest palindrome")
    public void givenTwoWordsSentenceFindLongestPalindrome(){
        String input="";
        ArrayList<String> expected=new ArrayList<String>(Arrays.asList("wew"));
        ArrayList<String> actual=LongestPalindrome.find("hello wew");
        Assertions.assertEquals(expected,actual);
    }
    @Test
    @DisplayName("given the sentence 'wew is really wow' to find longest palindrome")
    public void givenTwoSameLengthFindLongestPalindrome(){
        String input="";
        ArrayList<String> expected=new ArrayList<String>(Arrays.asList("wew","wow"));
        ArrayList<String> actual=LongestPalindrome.find("wew is really wow");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("given the sentence 'wew is really wow poop' to find longest palindrome")
    public void givenThreePalindromeFindLongestPalindrome(){
        String input="";
        ArrayList<String> expected=new ArrayList<String>(Arrays.asList("poop"));
        ArrayList<String> actual=LongestPalindrome.find("wew is really wow poop");
        Assertions.assertEquals(expected,actual);
    }


}
