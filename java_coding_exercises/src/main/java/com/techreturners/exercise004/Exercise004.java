package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
    public static final long GIGASECONDS = (long)Math.pow(10, 9);
    private final LocalDateTime aajkadin;
   public  Exercise004(LocalDate date) {
 //       throw new UnsupportedOperationException("You can delete this statement and add your code here.");

       this.aajkadin = date.atTime(0, 0);

    }

    public Exercise004(LocalDateTime dateTime) {
   //     throw new UnsupportedOperationException("You can delete this statement and add your code here.");
        this.aajkadin = dateTime;
    }
        public LocalDateTime getDateTime() {
        //throw new UnsupportedOperationException("You can delete this statement and add your code here.");
            return this.aajkadin.plusSeconds(GIGASECONDS);
    }
}
