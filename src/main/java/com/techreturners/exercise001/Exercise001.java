package com.techreturners.exercise001;

import java.util.List;


public class Exercise001 {
    public String capitalizeWord(String word) {

        return Character.toUpperCase(word.charAt(0))+word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
       //String initials=firstName.substring(0,1)+"."+lastName.substring(0,1);
        return firstName.substring(0,1)+"."+lastName.substring(0,1);

    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        double vat = originalPrice + ((vatRate / 100) * originalPrice);
        return (Math.round(vat * 100.0) / 100.0);

    }

    public String reverse(String sentence) {
        // Add your code here
        String reversedSentence="";
        for(int i=sentence.length()-1;i>=0;i--){
            reversedSentence = reversedSentence + sentence.charAt(i) ;

        }
        return reversedSentence;
    }

    public int countLinuxUsers(List<User> users)
    {


        int count = 0;

        for (User u : users) {
          if (u.getType().equals("Linux"))
           // if (u.getUsername().equals("Paul"))
            count++;
        }
        return count;
    }

}

