package com.sparta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        CheckPalindrome chekcer=new CheckPalindrome();
        System.out.println("Please input a word to check");
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine();
        System.out.println(CheckPalindrome.isPalindrom(word));

    }



}
