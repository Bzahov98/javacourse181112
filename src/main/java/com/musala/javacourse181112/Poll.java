package com.musala.javacourse181112;
import com.musala.javacourse181112.basics.Vote;
public class Poll {
    public static void main(String[] args) {
        int Maxvoters = 30;
        int Maxquestions = 2;
        String[][] voters = new String[Maxvoters][Maxquestions];
        System.out.println("Welcome!!! \nThe first question is: \nDo you like pizza?");
        for (int j = 0; j < Maxquestions; j++) {
            for(int i=0; i<Maxvoters; i++){


                if ((i % 2) == 0) {
                    voters[i][j] = String.valueOf(Vote.YES);
                } else {
                    voters[i][j] = String.valueOf(Vote.No);
                }
            }
        }
        int VotesYes=0, VotesNo=0;

        for (int i=0; i<Maxvoters; i++){
            if(voters[i][0].equals(String.valueOf(Vote.YES))){
                VotesYes++;
            }
            else{VotesNo++;
            }
        }
        System.out.println(Maxvoters + " voted out of which " + VotesYes + " voted Yes \nThe remaining " + VotesNo + " voted No.");

        System.out.println("\nThe second question is: \nIs it snowing?");

        VotesYes = 0; VotesNo = 0;

        for (int i=0; i<Maxvoters; i++){
            if(voters[i][1].equals(String.valueOf(Vote.YES))){
                VotesYes++;
            }
            else{VotesNo++;
            }
        }
        System.out.println(Maxvoters + " voted out of which " + VotesYes + " voted Yes \nThe remaining " + VotesNo + " voted No.");

        System.exit(0);

}}
