package com.sparta;

public class CheckPalindrome {
    public static boolean isPalindrom(String word){
        boolean condition=true;
        int totalChar=word.length();
        boolean newCondition;
        int lastIndex;
        for(int i=0; i<totalChar/2;i++){
            lastIndex=totalChar-1-i;
//            System.out.println("i: "+i);
//            System.out.println("lastIndex: "+lastIndex);
            char c1=word.charAt(i);
            char c2=word.charAt(lastIndex);
            newCondition=c1==c2;
            if(newCondition==false){
                return false;
            }
        }
        return true;

    }
}
