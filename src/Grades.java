/*
Write a program that uses if-else-if statements to print out grades A, B, C, D, F, according to the following criteria:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: <60
Use the Scanner class to accept a number score from the user to determine the letter grade. Print out “Score out of range”
if the score is less than 0 or greater than 100.
*/

import java.util.*;
public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score;
        System.out.println("Enter Score:"); //user enters score

        score = scan.nextInt(); // score from user assigned to int score, value used to enter if statement to return value
        if (score < 0 || score >100){
            System.out.println("Score out of range");
        }
        if(score<60){
            System.out.println("F");
        }
        if(score>=60 && score <=69){
            System.out.println("D");
        }
        if(score>=70 && score <=79){
            System.out.println("C");
        }

        if(score>=80 && score<=89){
            System.out.println("B");
        }

        if (score>=90 && score <=100){
            System.out.println("A");
        }

    }
}
