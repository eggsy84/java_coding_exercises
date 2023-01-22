package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String input) {

        boolean[] mark = new boolean[26];

        int index ;

        for (int i = 0; i < input.length(); i++)
        {
//in case of uppercase letter subtract 'A' to find the index
            if ('A' <=  input.charAt(i) &&  input.charAt(i) <= 'Z')
                index =  input.charAt(i) - 'A';
//in case of lowercase letter subtract 'a' to find the index
            else if ('a' <= input.charAt(i) &&  input.charAt(i) <= 'z')
                index =  input.charAt(i) - 'a';
//if character is other than alphabet
            else
                continue;
            mark[index] = true;
        }
//return false if any character is unmarked
        for (int i = 0; i <= 25; i++)
            if (!mark[i])
                return (false);
//if all characters were present
        return (true);
    }

}









