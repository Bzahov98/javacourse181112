package com.musala.javacourse181112.tasks;

/**
 * Created by Iva Koleva on 19.11.2018
 */
public class TernaryRunner {
    public static void main(final String[] args) {
        String value = "yes";
int  a=0;

        int yesCounter = 0;
        int noCounter = 0;

      if("yes".equals(value)) {
            yesCounter++;
        } else if("no".equals(value)) {
            noCounter++;
        }
    a="yes".equals(value)? yesCounter++:noCounter++;
        System.out.println("Yes: "+ yesCounter+"\nNo: "+noCounter);

        // TODO: 2-lines implementation, using ternary operator
    }
}