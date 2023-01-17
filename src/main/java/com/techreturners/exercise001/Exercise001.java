package com.techreturners.exercise001;

import java.util.List;


public class Exercise001 {
    public String capitalizeWord(String word) {
        //Add your code here

        return Character.toUpperCase(word.charAt(0))+word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
       String initials=firstName.substring(0,1)+"."+lastName.substring(0,1);
        return initials ;

    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        return 0.0;
    }

    public String reverse(String sentence) {
        // Add your code here
        String reversedSentence="";
        for(int i=sentence.length()-1;i>=0;i--){
            reversedSentence=reversedSentence+sentence.charAt(i) ;
        }
        return reversedSentence;
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return 0;
    }
}

