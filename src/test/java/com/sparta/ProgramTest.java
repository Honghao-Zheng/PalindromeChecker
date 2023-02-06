package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ProgramTest {
@ParameterizedTest
    @ValueSource(strings={"wow","poop","madam"})
    @DisplayName("words that have length of 3,4,5 that are Palindrome")
    public void truePalindrome(String word) {
    boolean expectPassed = true;
    boolean result = CheckPalindrome.isPalindrom(word);
    Assertions.assertEquals(expectPassed, result);
}

    @ParameterizedTest
    @ValueSource(strings={"cat","moon","right"})
    @DisplayName("words that have length of 3,4,5 are not Palindrome")
    public void falsePalindrome(String word){
        boolean expectPassed=false;
        boolean result=CheckPalindrome.isPalindrom(word);
        Assertions.assertEquals(expectPassed,result);
}
}
