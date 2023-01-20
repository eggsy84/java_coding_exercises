package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String input) {
        {
            // throw new UnsupportedOperationException("You can delete this statement and add your code here.");

            //boolean isPangram = TRUE;
            int[] check = new int[26];
            String str = input.toLowerCase();

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != 36 && str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                    check[str.charAt(i) - 97] = 1;
                }
            }

            for (int i = 0; i < 26; i++) {
                if (check[i] != 1) {
                   // isPangram = FALSE;
                }
            }

            return isPangram;
        }
    }
}
        //throw new UnsupportedOperationException("You can delete this statement and add your code here.");
       /* boolean[] mark = new boolean[26];
        int pointer = 0;
         //int flag =1;
        for(int i=0;i<input.length();i++)
        {

        if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
            pointer = input.charAt(i) - 'A';
        } else if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
            pointer = input.charAt(i) - 'a';
            else
            continue;
        }
        mark[pointer] = true;

    }
        for (int i = 0; i < 26; i++) {
            if (mark[i] == false)
                return (false);
            return (true);
        }
    }*/









