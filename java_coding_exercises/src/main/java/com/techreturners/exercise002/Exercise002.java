package com.techreturners.exercise002;

public class Exercise002 {


    public boolean isFromManchester(Person person) {





        if (person.getCity().equals("Manchester"))
            return true;
         else
          return false;


    }

    public boolean canWatchFilm( Person person, int age) {

        {



            if (person.getAge() >= age)
                return true;
             else
                return false;
        }
    }
}

